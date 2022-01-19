package br.com.surb.surb.modules.score.useCases.ScoreUpdate;

import br.com.surb.surb.modules.movie.dto.MovieDTO;
import br.com.surb.surb.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.surb.modules.movie.infra.jpa.repositories.MovieRepository;
import br.com.surb.surb.modules.score.dto.ScoreDTO;
import br.com.surb.surb.modules.score.infra.entities.Score;
import br.com.surb.surb.modules.score.infra.repositories.ScoreRepository;
import br.com.surb.surb.modules.user.infra.jps.entities.User;
import br.com.surb.surb.modules.user.infra.jps.repositories.UserRepository;
import br.com.surb.surb.modules.user.useCases.UserCreate.UserCreateService;
import br.com.surb.surb.shared.exeptions.services.AppNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class ScoreUpdateService {

  private final ScoreRepository scoreRepository;
  private final UserRepository userRepository;
  private final MovieRepository movieRepository;

  public ScoreUpdateService(ScoreRepository scoreRepository, UserRepository userRepository,
                            MovieRepository movieRepository){
    this.scoreRepository = scoreRepository;
    this.userRepository = userRepository;
    this.movieRepository = movieRepository;
  }

  @Transactional
  public MovieDTO execute(Long id, ScoreDTO scoreDTO) {

    User user = userRepository.findByEmail(scoreDTO.getEmail());

    if(user == null){
      user = new User();
      user.setEmail(scoreDTO.getEmail());
      user = userRepository.saveAndFlush(user);
    }

    Movie movie = movieRepository.getById(id);
    System.out.println("ID MOVIE " + movie.getId());

    Score score = new Score();
    score.setUser(user);
    score.setMovie(movie);
    score.setValue(scoreDTO.getScore());

    scoreRepository.saveAndFlush(score);
    double sum = 0.0;
    for(Score s : movie.getScores()) {
      sum = sum + s.getValue();
    }

    double avg = sum / movie.getScores().size();
    movie.setScore(avg);
    movie.setCount(movie.getScores().size());

    movie = movieRepository.save(movie);

    return new MovieDTO(movie);

  }
}

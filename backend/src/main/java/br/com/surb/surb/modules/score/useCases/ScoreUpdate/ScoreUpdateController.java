package br.com.surb.surb.modules.score.useCases.ScoreUpdate;

import br.com.surb.surb.modules.movie.dto.MovieDTO;
import br.com.surb.surb.modules.score.dto.ScoreDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/scores")
public class ScoreUpdateController {

  private final ScoreUpdateService scoreUpdateService;

  public ScoreUpdateController(ScoreUpdateService scoreUpdateService){
    this.scoreUpdateService = scoreUpdateService;
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<MovieDTO> handle(@PathVariable Long id, @RequestBody ScoreDTO scoreDTO){

    MovieDTO movieDTO = scoreUpdateService.execute(id, scoreDTO);
    return ResponseEntity.ok().body(movieDTO);

  }
}

package br.com.surb.surb.modules.score.infra.repositories;

import br.com.surb.surb.modules.score.infra.entities.Score;
import br.com.surb.surb.modules.score.infra.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}

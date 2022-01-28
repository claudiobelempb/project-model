package br.com.surb.surb.modules.section.infra.repositories;

import br.com.surb.surb.modules.section.infra.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}

package br.com.surb.surb.modules.resource.infra.repositories;

import br.com.surb.surb.modules.resource.infra.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}

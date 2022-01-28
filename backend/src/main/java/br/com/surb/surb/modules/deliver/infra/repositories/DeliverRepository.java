package br.com.surb.surb.modules.deliver.infra.repositories;

import br.com.surb.surb.modules.deliver.infra.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}

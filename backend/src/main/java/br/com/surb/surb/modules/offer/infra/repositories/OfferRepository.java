package br.com.surb.surb.modules.offer.infra.repositories;

import br.com.surb.surb.modules.offer.infra.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}

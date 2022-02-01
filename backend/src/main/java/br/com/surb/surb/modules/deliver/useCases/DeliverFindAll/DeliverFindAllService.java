package br.com.surb.surb.modules.deliver.useCases.DeliverFindAll;

import br.com.surb.surb.modules.deliver.dto.DeliverDTO;
import br.com.surb.surb.modules.deliver.infra.entities.Deliver;
import br.com.surb.surb.modules.deliver.infra.repositories.DeliverRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverFindAllService {

  private final DeliverRepository deliverRepository;

  public DeliverFindAllService(DeliverRepository deliverRepository){
    this.deliverRepository = deliverRepository;
  }

  @Transactional(readOnly = true)
  public Page<DeliverDTO> execute(Pageable pageable){
    Page<Deliver> delivers = deliverRepository.findAll(pageable);
    return delivers.map(deliver -> new DeliverDTO(deliver));
  }
}

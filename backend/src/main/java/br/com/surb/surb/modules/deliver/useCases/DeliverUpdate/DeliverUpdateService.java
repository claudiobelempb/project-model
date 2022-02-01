package br.com.surb.surb.modules.deliver.useCases.DeliverUpdate;

import br.com.surb.surb.modules.deliver.dto.DeliverUpdateDTO;
import br.com.surb.surb.modules.deliver.infra.entities.Deliver;
import br.com.surb.surb.modules.deliver.infra.repositories.DeliverRepository;
import br.com.surb.surb.shared.constants.ExceptionConstants;
import br.com.surb.surb.shared.exeptions.services.AppNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverUpdateService {

  private final DeliverRepository deliverRepository;

  public DeliverUpdateService(DeliverRepository deliverRepository){
    this.deliverRepository = deliverRepository;
  }
  
  @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
  @Transactional
  public void execute(Long id, DeliverUpdateDTO deliverUpdateDTO){
    try{
      Deliver deliver = deliverRepository.getById(id);
      deliver.setStatusDeliver(deliverUpdateDTO.getStatusDeliver());
      deliver.setFeedback(deliverUpdateDTO.getFeedback());
      deliver.setCorrectCount(deliverUpdateDTO.getCorrectCount());
      deliver.setStatus(deliverUpdateDTO.isStatus());
      deliverRepository.save(deliver);

    }catch (EmptyResultDataAccessException e){
      throw new AppNotFoundException(ExceptionConstants.ENTITY_NOT_FOUND + id);
    }
  }

}

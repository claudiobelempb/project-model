package br.com.surb.surb.modules.deliver.useCases.DeliverUpdate;

import br.com.surb.surb.modules.deliver.dto.DeliverUpdateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/deliveries")
public class DeliverUpdateResource {

  private final DeliverUpdateService deliverUpdateService;

  public DeliverUpdateResource(DeliverUpdateService deliverUpdateService){
    this.deliverUpdateService = deliverUpdateService;
  }


  @PutMapping(value = "/{id}")
  public ResponseEntity<Void> handle(@PathVariable Long id, @RequestBody DeliverUpdateDTO deliverUpdateDTO){
    deliverUpdateService.execute(id, deliverUpdateDTO);
    return ResponseEntity.noContent().build();
  }
}

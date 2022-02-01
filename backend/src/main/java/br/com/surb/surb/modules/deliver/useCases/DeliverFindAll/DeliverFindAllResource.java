package br.com.surb.surb.modules.deliver.useCases.DeliverFindAll;

import br.com.surb.surb.modules.deliver.dto.DeliverDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/deliveries")
public class DeliverFindAllResource {

  private final DeliverFindAllService deliverFindAllService;

  public DeliverFindAllResource(DeliverFindAllService deliverFindAllService){
    this.deliverFindAllService = deliverFindAllService;
  }

  @GetMapping
  public ResponseEntity<Page<DeliverDTO>> handle(Pageable pageable){
    Page<DeliverDTO> page = deliverFindAllService.execute(pageable);
    return ResponseEntity.ok().body(page);
  }
}

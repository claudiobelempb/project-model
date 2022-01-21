package br.com.surb.surb.modules.department.useCase.DepartmentFindAll;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentFindAllResource {

  private final DepartmentFindAllService departmentFindAllService;

  public DepartmentFindAllResource(DepartmentFindAllService departmentFindAllService){
    this.departmentFindAllService = departmentFindAllService;
  }

  @GetMapping
  public ResponseEntity<Page<DepartmentDTO>> handle(Pageable pageable){
    Page<DepartmentDTO> departmentDTOS = departmentFindAllService.execute(pageable);
    return ResponseEntity.ok().body(departmentDTOS);
  }

}

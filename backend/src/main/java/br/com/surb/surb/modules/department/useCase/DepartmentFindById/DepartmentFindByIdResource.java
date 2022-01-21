package br.com.surb.surb.modules.department.useCase.DepartmentFindById;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentFindByIdResource {

  private final DepartmentFindByIdService departmentFindByIdService;

  public DepartmentFindByIdResource(DepartmentFindByIdService departmentFindByIdService) {
    this.departmentFindByIdService = departmentFindByIdService;
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<DepartmentDTO> handle(@PathVariable Long id){
    DepartmentDTO departmentDTO = departmentFindByIdService.execute(id);
    return ResponseEntity.ok().body(departmentDTO);
  }

}

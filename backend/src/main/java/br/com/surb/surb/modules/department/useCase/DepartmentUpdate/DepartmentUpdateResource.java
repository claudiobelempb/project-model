package br.com.surb.surb.modules.department.useCase.DepartmentUpdate;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentUpdateResource {

  private final DepartmentUpdateService departmentUpdateService;

  public DepartmentUpdateResource(DepartmentUpdateService departmentUpdateService){
    this.departmentUpdateService = departmentUpdateService;
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<DepartmentDTO> handle(@PathVariable Long id, @RequestBody DepartmentDTO departmentDTO){
    departmentDTO = departmentUpdateService.execute(id, departmentDTO);
    return ResponseEntity.ok().body(departmentDTO);
  }
}

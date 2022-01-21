package br.com.surb.surb.modules.department.useCase.DepartmentStatus;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentStatusResource {

  private final DepartmentStatusService departmentStatusService;

  public DepartmentStatusResource(DepartmentStatusService departmentStatusService){
    this.departmentStatusService = departmentStatusService;
  }

  @PatchMapping(value = "/status/{id}")
  public ResponseEntity<Void> handle(@PathVariable Long id, @RequestBody DepartmentDTO departmentDTO){
    departmentStatusService.execute(id, departmentDTO);
    return ResponseEntity.noContent().build();
  }

}

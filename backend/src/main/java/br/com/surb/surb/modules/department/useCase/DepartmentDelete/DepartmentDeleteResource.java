package br.com.surb.surb.modules.department.useCase.DepartmentDelete;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentDeleteResource {

  private final DepartmentDeleteService departmentDeleteService;

  public DepartmentDeleteResource(DepartmentDeleteService departmentDeleteService){
    this.departmentDeleteService = departmentDeleteService;
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> handle(@PathVariable Long id){
    departmentDeleteService.execute(id);
    return ResponseEntity.noContent().build();
  }
}

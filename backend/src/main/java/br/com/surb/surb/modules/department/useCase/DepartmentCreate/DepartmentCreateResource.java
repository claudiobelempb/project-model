package br.com.surb.surb.modules.department.useCase.DepartmentCreate;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentCreateResource {

  private final DepartamentCreateService departamentCreateService;

  public DepartmentCreateResource(DepartamentCreateService departamentCreateService){
    this.departamentCreateService =  departamentCreateService;
  }

  @PostMapping
  public ResponseEntity<DepartmentDTO> handle(@RequestBody DepartmentDTO departmentDTO){
    departmentDTO = departamentCreateService.execute(departmentDTO);
    URI uri =
      ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(departmentDTO.getId()).toUri();
    return ResponseEntity.created(uri).body(departmentDTO);
  }
}

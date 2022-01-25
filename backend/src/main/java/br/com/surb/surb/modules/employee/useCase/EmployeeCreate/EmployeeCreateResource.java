package br.com.surb.surb.modules.employee.useCase.EmployeeCreate;

import br.com.surb.surb.modules.employee.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeCreateResource {

  private final EmployeeCreateService employeeCreateService;

  public EmployeeCreateResource(EmployeeCreateService employeeCreateService){
    this.employeeCreateService = employeeCreateService;
  }

  @PostMapping
  public ResponseEntity<EmployeeDTO> handle(@RequestBody EmployeeDTO employeeDTO){
    employeeDTO = employeeCreateService.execute(employeeDTO);
    System.out.println("Employee: " + employeeDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(employeeDTO.getId()).toUri();
    return ResponseEntity.created(uri).body(employeeDTO);
  }

}

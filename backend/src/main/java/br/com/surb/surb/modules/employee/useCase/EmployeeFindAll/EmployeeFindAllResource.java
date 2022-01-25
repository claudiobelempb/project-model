package br.com.surb.surb.modules.employee.useCase.EmployeeFindAll;

import br.com.surb.surb.modules.employee.dto.EmployeeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeFindAllResource {

  private final EmployeeFindAllService employeeFindAllService;

  public EmployeeFindAllResource(EmployeeFindAllService employeeFindAllService){
    this.employeeFindAllService = employeeFindAllService;
  }

  @GetMapping
  public ResponseEntity<Page<EmployeeDTO>> handle(Pageable pageable){
    Page<EmployeeDTO> page = employeeFindAllService.execute(pageable);
    return ResponseEntity.ok().body(page);
  }
}

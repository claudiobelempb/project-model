package br.com.surb.surb.modules.employee.useCase.EmployeeFindAll;

import br.com.surb.surb.modules.employee.dto.EmployeeDTO;
import br.com.surb.surb.modules.employee.jpa.entities.Employee;
import br.com.surb.surb.modules.employee.jpa.repositories.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeFindAllService {

  private final EmployeeRepository employeeRepository;

  public EmployeeFindAllService(
    EmployeeRepository employeeRepository
  ){
    this.employeeRepository = employeeRepository;
  }

  @Transactional(readOnly = true)
  public Page<EmployeeDTO> execute(Pageable pageable){
    Page<Employee> employees = employeeRepository.findAll(pageable);
    return employees.map(employee -> new EmployeeDTO(employee));
  }

}

package br.com.surb.surb.modules.employee.useCase.EmployeeCreate;

import br.com.surb.surb.modules.employee.dto.EmployeeDTO;
import br.com.surb.surb.modules.employee.jpa.entities.Employee;
import br.com.surb.surb.modules.employee.jpa.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeCreateService {

  private final EmployeeRepository employeeRepository;

  public EmployeeCreateService(EmployeeRepository employeeRepository){
    this.employeeRepository = employeeRepository;
  }

  @Transactional
  public EmployeeDTO execute(EmployeeDTO employeeDTO){
    Employee employee = new Employee();
    employee.setName(employeeDTO.getName());
    employee.setEmail(employeeDTO.getEmail());
    employee = employeeRepository.save(employee);
    System.out.println("Employee: " + employee);
    return new EmployeeDTO(employee);
  }

}

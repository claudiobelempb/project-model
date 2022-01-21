package br.com.surb.surb.modules.department.useCase.DepartmentCreate;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import br.com.surb.surb.modules.department.infra.jpa.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartamentCreateService {

  private final DepartmentRepository departmentRepository;

  public DepartamentCreateService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;
  }

  @Transactional
  public DepartmentDTO execute(DepartmentDTO departmentDTO){
    Department department = new Department();
    department.setName(departmentDTO.getName());
    department = departmentRepository.save(department);
    return new DepartmentDTO(department);
  }
}

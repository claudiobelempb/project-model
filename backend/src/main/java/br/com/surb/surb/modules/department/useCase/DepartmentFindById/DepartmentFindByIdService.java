package br.com.surb.surb.modules.department.useCase.DepartmentFindById;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import br.com.surb.surb.modules.department.infra.jpa.repositories.DepartmentRepository;
import br.com.surb.surb.shared.constants.ExceptionConstants;
import br.com.surb.surb.shared.exeptions.services.AppNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DepartmentFindByIdService {

  private final DepartmentRepository departmentRepository;

  public DepartmentFindByIdService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;
  }

  @Transactional(readOnly = true)
  public DepartmentDTO execute(Long id){

    Optional<Department> optionalDepartment = departmentRepository.findById(id);
    Department department =
      optionalDepartment.orElseThrow(() -> new AppNotFoundException(ExceptionConstants.ENTITY_NOT_FOUND));
    return new DepartmentDTO(department);

  }
}

package br.com.surb.surb.modules.department.useCase.DepartmentStatus;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import br.com.surb.surb.modules.department.infra.jpa.repositories.DepartmentRepository;
import br.com.surb.surb.shared.constants.ExceptionConstants;
import br.com.surb.surb.shared.exeptions.services.AppNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class DepartmentStatusService {

  private final DepartmentRepository departmentRepository;

  public DepartmentStatusService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;
  }

  @Transactional
  public void execute(Long id, DepartmentDTO departmentDTO){
    try{
      Department department = departmentRepository.getById(id);
      department.setStatus(departmentDTO.getStatus());
      departmentRepository.save(department);
    }catch (EntityNotFoundException e){
      throw new AppNotFoundException(ExceptionConstants.ENTITY_NOT_FOUND);
    }
  }


}

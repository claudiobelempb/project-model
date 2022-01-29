package br.com.surb.surb.modules.department.useCase.DepartmentDelete;

import br.com.surb.surb.modules.department.infra.jpa.repositories.DepartmentRepository;
import br.com.surb.surb.shared.constants.ExceptionConstants;
import br.com.surb.surb.shared.exeptions.services.AppNotFoundException;
import br.com.surb.surb.shared.exeptions.services.AppDataBaseException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class DepartmentDeleteService {

  private final DepartmentRepository departmentRepository;

  public DepartmentDeleteService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;
  }

  public void execute(Long id){
    try{
      departmentRepository.deleteById(id);
    } catch (EmptyResultDataAccessException e){
      throw new AppNotFoundException(ExceptionConstants.ENTITY_NOT_FOUND + id);
    } catch (DataIntegrityViolationException e) {
      throw new AppDataBaseException(ExceptionConstants.INTEGRITY_VIOLATION);
    }
  }

}

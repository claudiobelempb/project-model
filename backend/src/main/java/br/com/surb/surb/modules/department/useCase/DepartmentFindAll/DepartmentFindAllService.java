package br.com.surb.surb.modules.department.useCase.DepartmentFindAll;

import br.com.surb.surb.modules.department.dto.DepartmentDTO;
import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import br.com.surb.surb.modules.department.infra.jpa.repositories.DepartmentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentFindAllService {

  public DepartmentRepository departmentRepository;

  public DepartmentFindAllService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;
  }

  @Transactional(readOnly = true)
  public Page<DepartmentDTO> execute(Pageable pageable){
    Page<Department> departments = departmentRepository.findAll(pageable);
    return departments.map(department -> new DepartmentDTO(department));
  }
}

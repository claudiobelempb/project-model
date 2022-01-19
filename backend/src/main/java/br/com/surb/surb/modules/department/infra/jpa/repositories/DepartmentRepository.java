package br.com.surb.surb.modules.department.infra.jpa.repositories;

import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

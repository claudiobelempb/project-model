package br.com.surb.surb.modules.employee.jpa.repositories;

import br.com.surb.surb.modules.employee.jpa.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package br.com.surb.surb.modules.course.infra.repositories;

import br.com.surb.surb.modules.course.infra.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}

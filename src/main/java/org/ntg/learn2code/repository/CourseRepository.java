package org.ntg.learn2code.repository;

import org.ntg.learn2code.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByDivisionIdAndIsActiveTrue(Long divisionId);
}

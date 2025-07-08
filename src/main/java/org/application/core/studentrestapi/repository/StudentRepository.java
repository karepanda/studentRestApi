package org.application.core.studentrestapi.repository;

import org.application.core.studentrestapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

package edu.kidswhocode.studentmgmt.repository;

import edu.kidswhocode.studentmgmt.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

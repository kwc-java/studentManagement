package edu.kidswhocode.studentmgmt.repository;
import edu.kidswhocode.studentmgmt.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {

    }


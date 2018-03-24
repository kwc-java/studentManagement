package edu.kidswhocode.studentmgmt.repository;

import edu.kidswhocode.studentmgmt.domain.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Long, Level> {
}

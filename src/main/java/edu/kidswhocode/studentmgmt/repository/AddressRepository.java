package edu.kidswhocode.studentmgmt.repository;

import edu.kidswhocode.studentmgmt.domain.Address;
import edu.kidswhocode.studentmgmt.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Long, Address> {

}
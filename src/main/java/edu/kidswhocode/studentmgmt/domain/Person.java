package edu.kidswhocode.studentmgmt.domain;

import javax.persistence.Entity;

@Entity
public abstract class Person extends AbstractAuditingEntity {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

}

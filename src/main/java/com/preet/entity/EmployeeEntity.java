package com.preet.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    @Column(name = "address_id")
    private String addressId;
    @Column(name = "department_id")
    private String departmentId;
}

package com.qz.springboot.entity;

import javax.persistence.*;
import lombok.Data;

@Table(name = "employee")
@Data
public class Employee {
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "user_name")
    private String userName;

    private Integer age;

    @Column(name = "gra_id")
    private Integer graId;
    //
}
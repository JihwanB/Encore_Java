package com.encore.workshop.workshop4.grade.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String name;
    private String employeeNo;
    private int age;

    public Employee(String name, String employeeNo, int age) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.age = age;
    }

    public Employee() {
    }
}

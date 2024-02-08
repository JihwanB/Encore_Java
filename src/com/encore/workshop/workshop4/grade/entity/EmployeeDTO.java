package com.encore.workshop.workshop4.grade.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private String name;
    private String employeeNo;
    private int age;

    public EmployeeDTO(String name, String employeeNo, int age) {

        this.name = name;
        this.employeeNo = employeeNo;
        this.age = age;

    }

    public EmployeeDTO() {

    }

    public String emp_Info() {

        return  "name= " + name + ", employeeNo= " + employeeNo + ", age= " + age;

    }

}

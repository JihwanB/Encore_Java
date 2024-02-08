package com.encore.workshop.workshop4.grade.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO extends EmployeeDTO {

    private int oracle;
    private int java;
    private int servlet;

    public StudentDTO(String name, String employeeNo, int age, int oracle, int java, int servlet) {

        super(name, employeeNo, age);
        this.oracle = oracle;
        this.java = java;
        this.servlet = servlet;

    }

    public int getTotal() {
        return oracle + java + servlet;
    }

    public double getAverage() {

        double total = getTotal();
        total /= 3;
        return total;

    }

    @Override
    public String emp_Info() {

        return super.emp_Info() + ", oracle= " + oracle + ", java= " + java + ", servlet= " + servlet;

    }

}

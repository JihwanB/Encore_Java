package com.encore.workshop.workshop4.grade.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Employee {

    private int oracle;
    private int java;
    private int servlet;

    public Student(String name, String employeeNo, int age, int oracle, int java, int servlet) {
        this.setName(name);
        this.setEmployeeNo(employeeNo);
        this.setAge(age);
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
    public String toString() {
        return String.format("%s %d %d %d %d %s", getName(), getOracle(), getJava(), getServlet(), getTotal(), getAverage());
    }

}

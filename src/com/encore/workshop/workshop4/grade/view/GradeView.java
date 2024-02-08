package com.encore.workshop.workshop4.grade.view;

import com.encore.workshop.workshop4.grade.entity.EmployeeDTO;
import com.encore.workshop.workshop4.grade.entity.StudentDTO;

public class GradeView {

    private EmployeeDTO[] empAry;
    private int idx = 0;
    private int oracleTotal = 0, javaTotal = 0, servletTotal = 0;

    public GradeView() {

        empAry = new EmployeeDTO[5];
        init();

    }

    public void init() {

        empAry[idx++] = new StudentDTO("kim", "10000", 22, 100, 100, 100);
        empAry[idx++] = new StudentDTO("lee", "10001", 23, 20, 20, 20);
        empAry[idx++] = new StudentDTO("park", "10002", 24, 30, 30, 30);
        empAry[idx++] = new StudentDTO("choi", "10003", 25, 40, 40, 40);
        empAry[idx++] = new StudentDTO("steve", "10004", 26, 50, 50, 50);

    }

    public void gradeSum() {

        for (EmployeeDTO employeeDTO : empAry) {
            if (employeeDTO != null) {
                oracleTotal += ((StudentDTO) employeeDTO).getOracle();
                javaTotal += ((StudentDTO) employeeDTO).getJava();
                servletTotal += ((StudentDTO) employeeDTO).getServlet();
            }
        }

    }

    public void display() {
        gradeSum();
        System.out.println("번호 이름 오라클 자바 서블릿 총점 평균");
        System.out.println("===============================");
        for (int i = 0; i < empAry.length; i++) {
            EmployeeDTO obj = empAry[i];
            if (empAry[i] != null) {
                System.out.println((i + 1) + " " + obj.getName() + " " + ((StudentDTO) obj).getOracle()
                        + " " + ((StudentDTO) obj).getJava() + " " + ((StudentDTO) obj).getServlet()
                        + " " + ((StudentDTO) obj).getTotal() + " " + ((StudentDTO) obj).getAverage());
            }
        }
        System.out.println("===============================");
        System.out.printf("총점(오라클,자바,서블릿):%d %d %d%n", oracleTotal, javaTotal, servletTotal);

    }

}

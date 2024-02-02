package com.encore.hms.domain;

public class OopExtendsMain {
    public static void main(String[] args) {
        StudentDTO stu02 = new StudentDTO("정민지", 26, "노원구", "2018");
        System.out.println("학생 객체 생성");
        System.out.println("학생 객체 personInfo 메서드 :\t" + stu02.personInfo());
        System.out.println("학생 객체 studentInfo 메서드 :\t" + stu02.studentInfo() + "\n");

        TeacherDTO teacher02 = new TeacherDTO("임섭순", 30, "서초구", "java");
        System.out.println("강사 객체 생성");
        System.out.println("강사 객체 personInfo 메서드 :\t" + teacher02.personInfo());
        System.out.println("강사 객체 teacherInfo 메서드 :\t" + teacher02.teacherInfo() + "\n");

        EmployeeDTO emp02 = new EmployeeDTO("권태하", 30, "서초구", "교육운영팀");
        System.out.println("직원 객체 생성");
        System.out.println("직원 객체 personInfo 메서드 :\t" + emp02.personInfo());
        System.out.println("직원 객체 employeeInfo 메서드 :\t" + emp02.employeeInfo() + "\n");
    }
}

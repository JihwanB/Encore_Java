package com.encore.hms.domain;

public class OopMain {

    public static void main(String[] args) {

        StudentDTO stu01 = new StudentDTO("정민지", 26, "노원구", "2018");
        System.out.println("학생 객체 생성 - " + stu01);

        // 나이 변경 후 변경된 값 확인
        System.out.println();
        stu01.setAge(-100);
        System.out.println(stu01.getAge());

        // 강사 객체 생성 후 정보 확인
        System.out.println();
        TeacherDTO teacher01 = new TeacherDTO("임섭순", 30, "서초구", "java");
        System.out.println("강사 객체 생성 - " + teacher01);

        // 직원객체 생성후 정보 확인(EmployeeDTO - name, age, address, dept)
        System.out.println();
        EmployeeDTO emp01 = new EmployeeDTO("권태하", 30, "서초구", "교육운영팀");
        System.out.println("직원 객체 생성 - " + emp01);

    }

}

package com.encore.hms;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

public class RefAryMain {
    public static void main(String[] args) {

//        Person[] stuArr = new StudentDTO[30];
//
//        int idx = 0;
//        stuArr[idx++] = new StudentDTO("임정섭", 20, "서울", "1992");
//
//        // 만약, 학생 강사 직원 객체를 담는 배열을 사용하고자 한다면?
//        // 3개의 배열을 만드는데, 변수의 다형성이 적용된다면? - 1개
//
//        Person stu = new StudentDTO();
//        // stu.setStuId("2000"); -- error 부모타입은 자식에 접근할 수 없다
//        ((StudentDTO) stu).setStuId("2000"); // 캐스팅을 통해 자식의 구성요소에 접근
//
//        Person emp = new EmployeeDTO();
//        Person tea = new TeacherDTO();

        // 타입의 다형성을 배열에 적용한다면?
        int perIdx = 0;
        Person[] perArr = new Person[10];
        perArr[perIdx++] = new StudentDTO("임정섭", 20, "서울", "1992");
        perArr[perIdx++] = new TeacherDTO("임정섭", 20, "서울", "자바");
        perArr[perIdx++] = new EmployeeDTO("임정섭", 20, "서울", "교육 운영팀");

        for (int i = 0; i < perArr.length; i++) {
            Person per = perArr[i];
//            if (per instanceof StudentDTO) {
//                StudentDTO obj = (StudentDTO) per;
//                System.out.println(obj.studentInfo());
//            }
//            if (per instanceof TeacherDTO) {
//                TeacherDTO obj = (TeacherDTO) per;
//                System.out.println(obj.teacherInfo());
//            }
//            if (per instanceof EmployeeDTO) {
//                EmployeeDTO obj = (EmployeeDTO) per;
//                System.out.println(obj.employeeInfo());
//            }
            if (per == null) {
                break;
            }
            System.out.println(per.personInfo());   // 오버라이딩 된 메서드 호출
        } // end for

        System.out.println(">>> main demon thread end <<<");

    } // end main

}

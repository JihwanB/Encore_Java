package com.encore.hms.service;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;
import lombok.Getter;

import java.util.Scanner;

/*
 * business logic 가지고 있는 클래스
 * 1. 배열을 관리
 * 2. 생성된 배열에 학생, 강사, 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제 등의 기능을 수항핼 것
 */
public class HmsService {

    private Person[] perArr;
    @Getter
    private int idx;

    public HmsService() {
    }

    public HmsService(int size) {
        perArr = new Person[size];
    }

    public String makePerson(HmsType type, String name, int age, String address, String comm) {

        String msg;
        Person obj = null;

        switch (type) {
            case STU:
                obj = new StudentDTO(name, age, address, comm);
                break;
            case TEA:
                obj = new TeacherDTO(name, age, address, comm);
                break;
            case EMP:
                obj = new EmployeeDTO(name, age, address, comm);
                break;
        }
        setAry(obj);
        msg = (idx - 1) + "번지에 데이터를 담았습니다.";
        return msg;
    }

    public void setAry(Person per) {
        perArr[idx++] = per;
    }

    public Person[] getArr() {
        return perArr;
    }

    public Person searchPerson(String name) {
        Person person;

        for (Person per : perArr) {
            person = per;
            if (per != null) {
                if (person.getName().equals(name)) {
                    return person;
                }
            }
        }
        return null;
    }

    public String updatePerson(String name) {
        String msg;
        Person per = searchPerson(name);
        Scanner sc = new Scanner(System.in);

        if (per != null) {
            if (per instanceof StudentDTO) {
                System.out.print("변경할 학번을 입력하세요 : ");
                String toUpdate = sc.nextLine();
                ((StudentDTO) per).setStuId(toUpdate);
            } else if (per instanceof TeacherDTO) {
                System.out.print("변경할 과목을 입력하세요 : ");
                String toUpdate = sc.nextLine();
                ((TeacherDTO) per).setSubject(toUpdate);
            } else if (per instanceof EmployeeDTO) {
                System.out.print("변경할 부서를 입력하세요 : ");
                String toUpdate = sc.nextLine();
                ((EmployeeDTO) per).setDept(toUpdate);
            }
            msg = "정보를 수정하였습니다.";
        } else {
            msg = "존재하지 않는 이름입니다.";
        }
        return msg;
    }


}

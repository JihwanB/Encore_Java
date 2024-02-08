package com.encore.hms.service;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;
import lombok.Getter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

    public Person updatePerson(String name) {

        // 1.
//        Person[] copyArr = perArr.clone();
//        // 2.
//        Arrays.copyOf(perArr, perArr.length);

//        System.out.println("original arr address : " + perArr);
//        System.out.println("copy arr address : " + copyArr);

        return searchPerson(name);
    }

    public boolean removePerson(String name) {

        for (int i = 0; i < perArr.length; i++) {
            Person person = perArr[i];
            if (person.getName().equals(name)) {
                for (int j = i; j < perArr.length - 1; j++) {
                    perArr[j] = perArr[j + 1];
                }
                idx--;
                perArr[idx] = null;
                return true;
            }
        }
        return false;
    }

    public void saveToFile() {

        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("src/com/encore/stream/test.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(perArr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void loadFromFile() {

        FileInputStream fis;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src/com/encore/stream/test.txt");
            ois = new ObjectInputStream(fis);
            perArr = (Person[]) ois.readObject();
            int count = 0;
            for (Person person : perArr) {
                if (person != null) {
                    count++;
                }
            }
            idx = count;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

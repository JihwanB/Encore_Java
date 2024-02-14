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
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * business logic 가지고 있는 클래스
 * 1. Collection(List)을 관리
 * 2. 생성된 Collection 에 학생, 강사, 직원 객체를 담을 것
 * 3. 자료구조화 되어있는 메서드를 이용해서 찾기, 수정, 삭제 등의 기능을 수항핼 것
 */
public class HmsListService {

    private List<Person> lst;

    public HmsListService() {
    }

    public HmsListService(int size) {
        lst = new ArrayList<>(size);
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
        msg = (lst.lastIndexOf(obj)) + "번지에 데이터를 담았습니다.";
        return msg;
    }

    public void setAry(Person per) {
        lst.add(per);
    }

    public List<Person> getArr() {
        return lst;
    }

    public Person searchPerson(String name) {

        ListIterator<Person> iter = lst.listIterator();
        while (iter.hasNext()) {
            Person per = iter.next();
            if (per.getName().equals(name)) {
                return per;
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

        ListIterator<Person> iter = lst.listIterator();
        while (iter.hasNext()) {
            Person per = iter.next();
            if (per.getName().equals(name)) {
                lst.remove(per);
                return true;
            }
        }
        return false;

    }

    public void saveToFile() {

        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("src/com/encore/hms/hms_list.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lst);
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
            fis = new FileInputStream("src/com/encore/hms/hms_list.txt");
            ois = new ObjectInputStream(fis);
            lst = (List<Person>) ois.readObject();
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

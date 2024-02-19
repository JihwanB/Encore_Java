package com.encore.datastructure.collection.list;

import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

import java.util.*;

/*
 List 걔열의 자료구조는 순서가 있고(내부적으로 인덱스를 0부터 관리), 중복을 허용, 객체를 담으며(Object 상속하는 타입), 동적이다.
 Set 계열의 자료구조는 순서가 없고, 중복을 허용하지 않음, 객체를 담으며(Object 상속하는 타입), 동적이다.
 */
public class ListDemoMain {

    public static void main(String[] args) {

        List<Person> col01 = new ArrayList<>();
        //col01.add("A");
        //col01.add("B");
        // col01.add(1); -- error 제네릭스 문법을 적용하면 타입의 안정성 체크로 컴파일시 오류

        col01.add(new StudentDTO());
        col01.add(new StudentDTO());
        col01.add(new TeacherDTO());

        System.out.println("배열의 길이는 length, 자료구조는 size() : " + col01.size());
        System.out.println("데이터를 가져온다면 : " + col01.get(0) + "\t" + col01.get(1));
        System.out.println("제네릭스 문법을 적용하지 않을 때 반환되는 타입은 Object ");
        System.out.println("런타임 시점에 객체에 접근하기 위해서는 캐스팅이 필요 ");
        System.out.println("데이터를 가져온다면 : " + "\n\t" + ((StudentDTO) col01.get(0)).personInfo() + "\n"
                + col01.get(1).personInfo() + "\n" + col01.get(2).personInfo());
        System.out.println();

        List<String> col02 = new LinkedList<>();
        col02.add("B");
        col02.add("c");
        col02.add("D");
        System.out.println(col02.get(0) + "\t" + col02.get(1) + "\t" + col02.get(2));

    }

}

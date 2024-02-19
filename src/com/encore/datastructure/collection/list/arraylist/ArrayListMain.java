package com.encore.datastructure.collection.list.arraylist;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

import java.util.*;

public class ArrayListMain {

    public static void main(String[] args) {

        /*
        Number[] ary = new Number[5]; // static allocation
        for (int i = 0; i < 5; i++) {
            ary[i] = 10 * (i + 1);
        }
        System.out.println("length : " + ary.length);
        ary[2] = null;
        System.out.println(Arrays.toString(ary));
         */

        /*
        List<Number> lst = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lst.add(i * 10);
        }
        System.out.println("length : " + lst.size());
        lst.remove(2);
        System.out.println("length : " + lst.size());
         */

        List<String> lst01 = new ArrayList<>();
        lst01.add("A");
        lst01.add("B");
        lst01.add("C");
        lst01.add("D");
        lst01.add("E");
        System.out.println("length : " + lst01.size());

        List<String> lst02 = new ArrayList<>();
        lst02.add("1");
        lst02.add("2");
        lst01.addAll(lst02);
        System.out.println(lst01);
        lst01.add(3, "F");
        System.out.println(lst01);
        // 주의점 : 중간에 빈공간 (null) 을 허용하지 않음
        // null 을 포함하는 인덱스 번지에 추가하는 것은 예외가 발생됨!!!
        // lst01.add(9, "F"); -- exception

        // 특정 인덱스 번지의 데이터를 삭제
        lst01.remove(0);
        System.out.println(lst01);

        // 요소 검색
        System.out.println(lst01.contains("C") ? "요소검색 성공" : "요소검색 실패");
        System.out.println("검색된 요소의 인덱스 번지 : " + lst01.indexOf("C"));

        // 요소를 추출
        System.out.println(lst01.get(0));

        // 요소의 부분 추출
        List<String> subLst = lst01.subList(0, 5); // [start, end)
        System.out.println(subLst);

        // 요소 변경
        lst01.set(1, "encore");
        System.out.println(lst01);

        // 사이즈를 동적으로 늘리는 작업
        ((ArrayList<String>) lst01).ensureCapacity(100);
        System.out.println(lst01.size());

        // 보안상의 이유로 Deep copy 를 해야한다면?
        List<String> copyLst = (List<String>) ((ArrayList<String>) lst01).clone();
        System.out.println("original : " + lst01);
        System.out.println("copy : " + copyLst);
        lst01.set(0, "encore");
        System.out.println("original : " + lst01);
        System.out.println("copy : " + copyLst);

        // 자료구조를 배열로 반환해야 한다면?
        Object[] ary = copyLst.toArray();
        System.out.println(Arrays.toString(ary));

        // 정렬
        List<Integer> sortLst = new ArrayList<>();
        sortLst.add(3);
        sortLst.add(2);
        sortLst.add(1);
        System.out.println(sortLst);
        System.out.println(" --- sort --- ");
        sortLst.sort(Comparator.naturalOrder());
        System.out.println("ascending - " + sortLst);
        sortLst.sort(Comparator.reverseOrder());
        System.out.println("descending - " + sortLst);

        // 순회
        List<Person> hmsLst = new ArrayList<>();
        hmsLst.add(new StudentDTO("임정섭", 20, "서울", "1992"));
        hmsLst.add(new TeacherDTO("임정섭", 20, "서울", "자바"));
        hmsLst.add(new EmployeeDTO("임정섭", 20, "서울", "교육 서비스"));

        /*
        for (int i = 0; i < hmsLst.size(); i++) {
            Person obj = hmsLst.get(i);
            System.out.println(obj.personInfo());
        }
         */
        // Iterator
        Iterator<Person> it = hmsLst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().personInfo());
        }

        System.out.println("다시 한번 순회");
        it = hmsLst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().personInfo());
        }

        // List 에만 있는 ListIterator()
        ListIterator<Person> iter = hmsLst.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().personInfo());
        }
        while (iter.hasPrevious()) {
            System.out.println(iter.previous().personInfo());
        }

        // 전체 데이터를 삭제
        lst01.clear();
        System.out.println(lst01);

        // 모든 Collection 은 객체를 담는 자료구조(그릇)
        List<Integer> numberLst = new ArrayList<>();
        // int - Integer, char - Character (Wrapper Class)
        // int x = 10; Integer xx = new Integer(x); -> auto boxing
        // Integer xx = new Integer(10); int z = (int) xx + 10; -> auto unboxing
        // numberLst.add('A');
        numberLst.add(10);

    }

}

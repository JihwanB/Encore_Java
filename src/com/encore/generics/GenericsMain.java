package com.encore.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        /*
         제너릭스 사용시 코드상의 이점:
         - 컴파일 타입시 타입의 안정성 유지
         - 불필요한 다운캐스팅을 지양할 수 있다.
         */
        // ClassName<String, Integer> obj = new ClassName<>();

        // <T>
        // ClassName<Student> obj = new ClassName<>();

        // <E>
        /*
        ClassName<String> obj01 = new ClassName<>();
        ClassName<Integer> obj02 = new ClassName<>();

        obj01.setX("10");
        System.out.println("value : " + obj01.getX());
        System.out.println("변수의 타입 출력 : " + obj01.getX().getClass().getName());

        obj02.setX(10);
        System.out.println("value : " + obj02.getX());
        System.out.println("변수의 타입 출력 : " + obj02.getX().getClass().getName());
         */

        // <K, V>
        /*
        ClassName<String, Integer> obj = new ClassName<>();
        obj.setX("10", 10);
        System.out.println("key value : " + obj.getKey());
        System.out.println("변수의 타입 출력 : " + obj.getKey().getClass().getName());
         */

        // 제너릭스의 다형성
        // 와일드카드(?)를 사용할 수 있다.
        // <? extends Skating> : Skating 을 상속받는 모든 하위 객체르 포함하겠다는 의미
        // <? super Golf> : Golf 의 부모
        // extends 는 '?' 보다 하위를 포함하고, super 는 '?'의 부모 타입을 포함
        List<? super Sports> lst = new ArrayList<>();
        lst.add(new Golf());
        lst.add(new Skating());
        lst.add(new SpeedSkating());
        lst.add(new ShortTrackSkating());

    }

}

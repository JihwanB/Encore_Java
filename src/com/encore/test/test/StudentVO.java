package com.encore.test.test;

/*
 // single line comment
 * XXXVO.java, XXXDTO.java, XXXEntity.java
 * -- 업무로직이 없고 데이터만 관리하는 클래스로 변수 및 Setter, Getter 로 이루어
 */
public class StudentVO {
    /*
     * 변수 (Variable)
     * 구문형식 : 접근지정자 변수타입 변수명;
     * 접근지정자(public private, etc.)
     * 변수타입(기본타입, 참조타입)
     * 변수명 (소문자로 시작해야 함)
     * 변수는 선언 위치에 따라서 지역, 전역 변수로 구분 됨
     */

    // 전역변수 (클래스 내에서 접근 가능한 범위를 갖는 것)
    private String name;
    private int age;
    private double height;
    private boolean isMarried;

    /*
     * 생성자 (Constructor)
     * 구문형식:
     * 접근지정자 클래스이름([매개변수]){
     *
     * }
     * 매개변수가 없는 생성자는 기본 생성자
     * 매개변수가 있는 생성자는 스페셜 생성자
     * 명시적으로 생성자가 정의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행
     */

    /*
        메서드(함수)
        구문형식
        접근지정자 반환타입 메서드이름([매개변수]){
            문장;
            [return 기본값 | 참조값 ;]
        }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}

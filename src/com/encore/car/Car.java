package com.encore.car;

import com.encore.car.engine.Engine;

public class Car {
    // 전역(멤버)변수 scope는 클래서 전역에서 사용 가능한 변수
    private Engine engine;

    // 기본생성자 정의
    // 생성자는 Like a method로 반환타입이 정의되지 않고 메서드의 이름은 클래스의 이름과 동일
    public Car(){
        engine = new Engine();
    }

    public Car(String type){
        engine = new Engine(type);
    }

    public void engineInfo(){
        String info = engine.showInfo();
        System.out.println(">>>> 엔진 정보 <<<<");
        System.out.println(info);
    }
}

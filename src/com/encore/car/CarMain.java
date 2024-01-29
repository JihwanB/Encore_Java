package com.encore.car;

public class CarMain {
    public static void main(String[] args) {
        // Car car = new Car();
        Car car = new Car("가솔린");
        // Car 객체 생성 후 인스턴스 소유의 메서드 호출
        car.engineInfo();
    }
}

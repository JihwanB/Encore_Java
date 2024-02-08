package com.encore.hms.domain.sup;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
public class Person implements Serializable {

    private String name;
    private int age;
    private String address;

    public Person() {
        // super(); 부모클래스(Object) 생성자 호출
    }

    public String personInfo() {
        return "name = " + name + ", age = " + age + ", address = " + address;
    }
}

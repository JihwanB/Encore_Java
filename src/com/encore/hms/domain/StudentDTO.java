package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDTO extends Person {

    private String stuId;

    public StudentDTO(String name, int age, String address, String stuId) {
        super(name, age, address);
//        super.setName(name);
//        super.setAge(age);
//        super.setAddress(address);
        this.stuId = stuId;
    }

    public String studentInfo() { return super.personInfo() + ", stuId = " + this.getStuId(); }

    // overriding : 상속 관계에서 부모의 메서드를 자식에서 재정의하는 것
    // 접근지정자, 반환타입, 메서드명, 매개변수의 타입과 개수 일치해야 함
    @Override
    public String personInfo() { return super.personInfo() + ", stuId = " + this.getStuId(); }
}

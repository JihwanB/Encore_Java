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

    public String studentInfo() {
        return super.personInfo() + ", stuId = " + this.getStuId();
    }

}

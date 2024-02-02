package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeDTO extends Person {

    private String dept;

    public EmployeeDTO(String name, int age, String address, String dept) {
        super(name, age, address);
        this.dept = dept;
    }

    public String employeeInfo() {
        return super.personInfo() + ", dept = " + this.getDept();
    }

}

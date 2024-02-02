package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TeacherDTO extends Person {

    private String subject;

    public TeacherDTO(String name, int age, String address, String subject) {
        super(name, age, address);
        this.subject = subject;
    }

    public String teacherInfo() {
        return super.personInfo() + ", subject = " + this.getSubject();
    }

}

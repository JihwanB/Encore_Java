package com.encore.compare;

import lombok.*;

import java.util.Comparator;

/*
 Comparable 특성
 - 자기 자신과 매개변수를 비교하는 것
 - 구현 메서드는 compareTo()

 Comparator 특징
 - 인자로 전달되는 두 객체의 기준값을 가지고 비교하는 것
 - 구현 메서드는 compare()
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Teacher implements Comparator<Teacher> {

    private int age;
    private int classNumber;

    /*
    @Override
    public int compareTo(Teacher o) {
        if (this.age == o.age)
            return this.classNumber - o.classNumber;
        return this.age - o.age;
    }
     */

    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.age == o2.age)
            return o1.classNumber - o2.classNumber;
        return o1.age - o2.age;
    }

}

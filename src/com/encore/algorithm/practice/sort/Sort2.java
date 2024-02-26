package com.encore.algorithm.practice.sort;

import lombok.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 성적이 낮은 순서대로 출력하기
 */
public class Sort2 {

    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    @ToString
    static class Student implements Comparable<Student> {
        String name;
        int grade;

        @Override
        public int compareTo(Student o) {
            if (this.grade == o.grade)
                return this.name.compareTo(o.name);
            return this.grade - o.grade;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Student> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            lst.add(0, new Student(st.nextToken(), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(lst);

        for (Student stu : lst) {
            sb.append(stu.name).append(" ");
        }

        System.out.println(sb);

    }

}

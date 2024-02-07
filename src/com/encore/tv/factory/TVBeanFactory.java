package com.encore.tv.factory;

import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.util.TV;

/*
    Singleton Pattern: 인스턴스의 갯수를 하나로 유지하는 방법

    구현방법)
    1. 생성자의 접근지정자를 private
    2. getInstance() 정의해서 자기자신의 생성된 객체를 반환하는 구현
 */
public class TVBeanFactory {

    private TV[] ary;
    private static TVBeanFactory instance;

    private TVBeanFactory() {
        ary = new TV[2];
        ary[0] = new SamsungTV();
        ary[1] = new LgTV();
    }

    static public TVBeanFactory getInstance() {
        if (instance == null) {
            instance = new TVBeanFactory();
        }
        return instance;
    }

    public TV getBean(String brandName) {
        return (brandName.equals("samsung")) ? ary[0] : ary[1];
    }

}

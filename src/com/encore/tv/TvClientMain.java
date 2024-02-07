package com.encore.tv;

import com.encore.tv.factory.TVBeanFactory;
import com.encore.tv.util.TV;

public class TvClientMain {

    public static void main(String[] args) {

        TVBeanFactory factory = TVBeanFactory.getInstance();
        TV tv = factory.getBean("lg");
        tv.turnOn();

    }

}

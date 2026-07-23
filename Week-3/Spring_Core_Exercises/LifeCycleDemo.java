package com.cognizant;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        context.getBean("lifeCycleBean");

        context.close();
    }
}
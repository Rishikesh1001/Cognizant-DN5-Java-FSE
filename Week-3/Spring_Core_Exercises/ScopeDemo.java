package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ScopeBean bean1 = context.getBean("scopeBean", ScopeBean.class);
        ScopeBean bean2 = context.getBean("scopeBean", ScopeBean.class);

        System.out.println(bean1);
        System.out.println(bean2);
    }
}
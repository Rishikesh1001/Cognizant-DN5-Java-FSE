package com.cognizant;

public class LifeCycleBean {

    public void init() {
        System.out.println("Bean Initialized");
    }

    public void destroy() {
        System.out.println("Bean Destroyed");
    }
}
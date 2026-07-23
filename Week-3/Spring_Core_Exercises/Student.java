package com.cognizant;

public class Student {

    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Student: " + name);
        course.display();
    }
}
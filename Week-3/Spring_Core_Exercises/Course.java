package com.cognizant;

public class Course {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void display() {
        System.out.println("Course: " + courseName);
    }
}
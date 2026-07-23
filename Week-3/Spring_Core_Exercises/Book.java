package com.cognizant;

public class Book {

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}
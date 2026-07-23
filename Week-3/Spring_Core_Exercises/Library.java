package com.cognizant;

public class Library {

    private String name;
    private Book book;

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void display() {
        System.out.println("Library: " + name);
        book.display();
    }
}
package com.prof.homework.opp.library_management;

public class Book {
    private String name;
    private String author;
    private int yearPublishing;

    public String getName() {
        return name;
    }

    public Book(String name, String author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public void bookInfo() {
        System.out.println("Name : " + name);
        System.out.println("Author : " + author);
        System.out.println("Publishing year : " + yearPublishing);
    }

    public boolean antiquityCheck() {
        int currentlyYear = 2023;
        if (yearPublishing < currentlyYear - 50) {
            System.out.println("Book over 50 years old");
        } else {
            System.out.println("Book under 50 years old");
        }
        return false;
    }
}
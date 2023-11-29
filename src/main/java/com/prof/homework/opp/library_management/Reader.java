package com.prof.homework.opp.library_management;

public class Reader {
    private String name;
    private int age;
    private Book[] borrowedBooks;
    private int countBooks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void setCountBooks(int countBooks) {
        this.countBooks = countBooks;
    }

    public Reader(String name, int age, int limitBooks) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new Book[limitBooks];
        this.countBooks = 0;
    }

    public void borrowBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (countBooks < borrowedBooks.length) {
                borrowedBooks[countBooks++] = books[i];
                System.out.println(name + " " + age + " years old borrowed the book: " + books[i].getName());
            }
        }
        System.out.println("Total books borrowed: " + countBooks);
    }

    public void returnBook(Book books) {
        for (int i = 0; i < countBooks; i++) {
            if (borrowedBooks[i].equals(books)) {
                borrowedBooks[i] = borrowedBooks[countBooks - 1];
                borrowedBooks[countBooks - 1] = null;
                countBooks--;


                System.out.println(name + " return book : " + books.getName());
                System.out.println("Total books borrowed: " + countBooks);
            }
        }

        System.out.println(name + " can't return book, he didn't take it.");
        System.out.println("Total books borrowed: " + countBooks);
    }
}




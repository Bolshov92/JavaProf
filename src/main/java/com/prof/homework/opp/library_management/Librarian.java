package com.prof.homework.opp.library_management;

public class Librarian {
    private String name;
    private int workExperience;
    private Book[] availableBooks;

    public Librarian(String name, int workExperience, Book[] availableBooks) {
        this.name = name;
        this.workExperience = workExperience;
        this.availableBooks = availableBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return workExperience;
    }

    public void setExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public void issueBook(Reader user, Book book) {
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] != null && availableBooks[i].equals(book)) {
                user.borrowBook(availableBooks);
                availableBooks[i] = null;
                System.out.println(name + workExperience + " years experience" + " issued a book : " + book.getName() + " to the Reader : " + user.getName());
                return;
            }
        }
        System.out.println(name + " Can't get book : " + book.getName() + " Book not available.");
    }

    public void acceptBook(Reader user, Book book) {
        for (int i = 0; i < user.getBorrowedBooks().length; i++) {
            if (user.getBorrowedBooks()[i] != null)
                if (user.getBorrowedBooks()[i].equals(book)) {
                    for (int j = 0; j < availableBooks.length; j++) {
                        if (availableBooks[j] == null) {
                            availableBooks[j] = book;
                            user.returnBook(book);
                            System.out.println(name + " accepted book : " + book.getName() + " from reader:  " + user.getName());
                        }
                    }
                    System.out.println(name + " Can't accept book :  " + book.getName() + " not a place.");
                }
        }
        System.out.println(name + " Can't accept book  : " + book.getName() + "Reader didn't take such book");
    }
}



package com.prof.homework.opp.library_management;

public class APP {

    public static void main(String[] args) {
        Book book = new Book("Java", "James Gosling", 1995);
        Book bookOne = new Book("Python", "Guido van Rossum", 1991);
        Book bookTwo = new Book("Algorithms", "Cliford Stein", 1990);
        Book bookThree = new Book("Java Script", "Douglas Crockford", 1953);
        Book bookFour = new Book("Java Script", "Martin Coin", 1972);
        book.bookInfo();
        book.antiquityCheck();


        Reader reader = new Reader("Alex", 23, 5);
        Reader reader2 = new Reader("Slava", 30, 5);
        reader.borrowBook(new Book[]{bookFour, bookThree});
        reader2.borrowBook(new Book[]{bookTwo, book});
        reader2.returnBook(bookTwo);

        Book[] availableBooks = {};
        Librarian librarianOne = new Librarian("Jake ", 5, availableBooks);
        Librarian librarianTwo = new Librarian("John ", 5, availableBooks);
        Librarian librarianThree = new Librarian("Mark ", 5, availableBooks);
        Librarian librarianFour = new Librarian("Stive ", 5, availableBooks);
        librarianOne.issueBook(reader, bookFour);
        reader.returnBook(bookFour);
        librarianOne.acceptBook(reader, bookThree);

        Librarian[] librarians = {librarianOne, librarianTwo,librarianThree,librarianFour};
        Library library = new Library("City Library","Prospect 123",librarians);

        library.addLibrarian(librarianOne);
        library.addLibrarian(librarianTwo);
        library.addLibrarian(librarianThree);
        library.findLibrarian("Jake");
//        Не могу найти по именни , ни как не могу найти где допустил ошибку!!!
//        В цикле вроде все правильно но оно не хочет сравнивать equals.
    }
}

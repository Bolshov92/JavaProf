package com.prof.homework.library_management_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionProcessor {

    public static void main(String[] args) {
        Book bookOne = new Book("Harry Potter", "John Jonson", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(2002, 9, 11), 200);
        Book bookTwo = new Book("Algorithms", "Body", Genre.HISTORY, BookStatus.AVAILABLE, LocalDate.of(1992, 12, 23), 350);
        Book bookThree = new Book("Minor", "John Jonson", Genre.BIOGRAPHY, BookStatus.BORROWED, LocalDate.of(2010, 7, 8), 89);
        Book bookFour = new Book("World", "Body", Genre.SCIENCE, BookStatus.LOST, LocalDate.of(1954, 2, 15), 132);
        Magazine magazine = new Magazine("title", "Body", Genre.FANTASY, 10, LocalDate.of(2023, 12, 23), true);
        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookFour);
        List<Magazine> magazines = new ArrayList<>();
        magazines.add(magazine);
        User userOne = new User("Alex", "11", new ArrayList<>());
        User userTwo = new User("Jek", "12", new ArrayList<>());
        Librarian librarianOne = new Librarian("Alex", "11", new ArrayList<>());
        LibraryCatalogue libraryCatalogue = new LibraryCatalogue(books, magazines);

        List<LibraryItem> items = new ArrayList<>();
        items.add(bookOne);
        items.add(bookTwo);
        items.add(bookThree);
        items.add(bookFour);
        items.add(magazine);

        printAllItems(items);
        System.out.println();
        listItemsByGenre(items, Genre.HISTORY);
        System.out.println();
        sortByTitle(items);
        System.out.println();
        filterByAuthor(items, "Body");
        System.out.println();
        countItemsByStatus(items, BookStatus.AVAILABLE);
        System.out.println();

        updateStatus(items, BookStatus.BORROWED, BookStatus.AVAILABLE);
        printAllItems(items);

        System.out.println();
        listAvailableItems(items);

        System.out.println();
        findOldestItem(items);

    }

    public static void printAllItems(List<LibraryItem> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public static void listItemsByGenre(List<LibraryItem> items, Genre genre) {
        for (LibraryItem item : items) {
            if (item.getGenre() == genre) {
                System.out.println("Available Book with this Genre : " + item.getAuthor() + " " + item);
            }
        }
    }

    public static void sortByTitle(List<LibraryItem> items) {
        Collections.sort(items, Comparator.comparing(LibraryItem::getTitle));
        printAllItems(items);
    }

    public static void filterByAuthor(List<LibraryItem> items, String author) {

        for (LibraryItem e : items) {
            if (e.equals(author)) {
                System.out.println("Author : " + e.getAuthor());
            }
        }
    }

    public static void countItemsByStatus(List<LibraryItem> items, BookStatus status) {
        int count = 0;
        for (LibraryItem e : items) {
            if (e instanceof Book) {
                if (((Book) e).getStatus().equals(status)) {
                    count++;
                }
            }
        }
        System.out.println("Items by Status : " + status + " times " + count);
    }

    public static void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus) {
        for (LibraryItem e : items) {
            if (e instanceof Book) {
                if ((((Book) e).getStatus().equals(oldStatus))) {
                    ((Book) e).setStatus(newStatus);
                }
            }
        }
    }

    public static void listAvailableItems(List<LibraryItem> items) {
        for (LibraryItem e : items) {
            if (e instanceof Book) {
                if (((Book) e).isAvailable()) {
                    System.out.println(e);
                }
            }


        }
    }

    public static void findOldestItem(List<LibraryItem> items) {
        LocalDate current = LocalDate.now();
        LibraryItem oldestItem = null;
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                Book temp = (Book) item;
                if (temp.getPublishDate().isBefore(current)) {
                    current = temp.getPublishDate();
                    oldestItem = temp;
                }
            } else {
                Magazine temps = (Magazine) item;
                if (temps.getReleaseDate().isBefore(current)) {
                    current = temps.getReleaseDate();
                    oldestItem = temps;
                }
            }
        }
        System.out.println(oldestItem);
    }


    public static void groupItemsByAuthor(List<LibraryItem> items) {
    }

    public static void listItemsForRepair(List<LibraryItem> items) {
    }

    public static void displayItemCount(List<LibraryItem> items) {
    }

    public static void listBorrowedItemsByUser(List<LibraryItem> items, User user) {
    }

    public static void removeLostItems(List<LibraryItem> items) {
    }

    public static void addItemToList(List<LibraryItem> items, LibraryItem item) {
    }

    public static void removeItemFromList(List<LibraryItem> items, LibraryItem item) {
    }

    public static void sortItemsByPublicationDate(List<LibraryItem> items) {
    }

    public static void findMostPopularGenre(List<LibraryItem> items) {
    }

    public static void calculateAveragePageCount(List<Book> books) {
    }

    public static void listMonthlyMagazines(List<Magazine> magazines) {
    }

    public static void listItemsByCondition(List<LibraryItem> items, ItemCondition condition) {
    }
}
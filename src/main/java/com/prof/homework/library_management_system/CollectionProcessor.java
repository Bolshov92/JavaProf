package com.prof.homework.library_management_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionProcessor {

    public static void main(String[] args) {
        Book bookOne = new Book("Harry Potter", "John Jonson", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(2002, 9, 11), 200);
        Book bookTwo = new Book("Algorithms", "Body", Genre.HISTORY, BookStatus.AVAILABLE, LocalDate.of(1992, 12, 23), 350);
        Book bookThree = new Book("Minor", "John Jonson", Genre.BIOGRAPHY, BookStatus.RESERVED, LocalDate.of(2010, 7, 8), 89);
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

   public static void sortByTitle(List<LibraryItem> items){
       int n = items.size();

       for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               String title1 = items.get(j).getTitle();
               String title2 = items.get(j + 1).getTitle();

               if (title1.compareTo(title2) > 0) {
                   LibraryItem temp = items.get(j);
                   items.set(j, items.get(j + 1));
                   items.set(j + 1, temp);
               }
           }
       }

       System.out.println("Sorted by Title:");
       printAllItems(items);
   }
   public static void filterByAuthor(List<LibraryItem> items, String author){
   }
   public static void countItemsByStatus(List<LibraryItem> items, BookStatus status){
   }
   public static void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus){
   }
   public static void listAvailableItems(List<LibraryItem> items){
   }
   public static void findOldestItem(List<LibraryItem> items){
   }
   public static void groupItemsByAuthor(List<LibraryItem> items){
   }
   public static void listItemsForRepair(List<LibraryItem> items){
   }
   public static void displayItemCount(List<LibraryItem> items){
   }
   public static void listBorrowedItemsByUser(List<LibraryItem> items, User user){
   }
   public static void removeLostItems(List<LibraryItem> items){
   }
   public static void addItemToList(List<LibraryItem> items, LibraryItem item){
   }
   public static void removeItemFromList(List<LibraryItem> items, LibraryItem item){
   }
   public static void sortItemsByPublicationDate(List<LibraryItem> items){
   }
   public static void findMostPopularGenre(List<LibraryItem> items){
   }
   public static void calculateAveragePageCount(List<Book> books){
   }
   public static void listMonthlyMagazines(List<Magazine> magazines){
   }
   public static void listItemsByCondition(List<LibraryItem> items, ItemCondition condition){
   }
}
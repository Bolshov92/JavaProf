package com.prof.homework._29_11_23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CollectionProcessor {

    public static void main(String[] args) {


        Book book1 = new Book("Harry Potter", "John Jonson", Genre.FANTASY, BookStatus.AVAILABLE, LocalDate.of(2002, 9, 11), 200);
        List<LibraryItem> libraryItems = new ArrayList<>();


        Librarian librarian = new Librarian("Alex Romanov", "id1", libraryItems);

        Book book = new Book("title", "Body", Genre.HISTORY, BookStatus.AVAILABLE, LocalDate.of(1992, 12, 23), 350);
        Magazine magazine = new Magazine("title", "Budy", Genre.FANTASY, 10, LocalDate.of(2023, 12, 23), true);
        Librarian librarian1 = new Librarian("Alex", "11", libraryItems);
//        LibraryCatalogue libraryCatalogue = new LibraryCatalogue((List<Book>) book1, (List<Magazine>) magazine);
//        User user = new User("Jake", "11", (List<LibraryItem>) book);

        libraryItems.add(book);
        libraryItems.add(magazine);

        printAllItems(libraryItems);
        libraryItems.add(book1);

    }

    public static void printAllItems(List<LibraryItem> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public static void listItemsByGenre(List<LibraryItem> items, Genre genre) {
        for (int i = 0; i < items.size(); i++) {

//        }
//        public static void sortByTitle (List < LibraryItem > items) {
//
//        }
//        public static void filterByAuthor (List < LibraryItem > items, String author){
//
//        }
//        public static void countItemsByStatus (List < LibraryItem > items, BookStatus status){
//
//        }
//        public static void updateStatus (List < LibraryItem > items, BookStatus oldStatus, BookStatus newStatus){
//
//        }
//        public static void listAvailableItems (List < LibraryItem > items) {
//
//        }
//        public static void findOldestItem (List < LibraryItem > items) {
//
//        }
//        public static void groupItemsByAuthor (List < LibraryItem > items) {
//
//        }
//        public static void listItemsForRepair (List < LibraryItem > items) {
//
//        }
//        public static void displayItemCount (List < LibraryItem > items) {
//
//        }
//        public static void listBorrowedItemsByUser (List < LibraryItem > items, User user){
//
//        }
//        public static void removeLostItems (List < LibraryItem > items) {
//
//        }
//        public static void addItemToList (List < LibraryItem > items, LibraryItem item){
//
//        }
//        public static void removeItemFromList (List < LibraryItem > items, LibraryItem item){
//
//        }
//        public static void sortItemsByPublicationDate (List < LibraryItem > items) {
//
//        }
//        public static void findMostPopularGenre (List < LibraryItem > items) {
//
//        }
//        public static void calculateAveragePageCount (List < Book > books) {
//
//        }
//        public static void listMonthlyMagazines (List < Magazine > magazines) {
//
//        }
//        public static void listItemsByCondition (List < LibraryItem > items, ItemCondition condition){
//
//        }
        }
    }
}


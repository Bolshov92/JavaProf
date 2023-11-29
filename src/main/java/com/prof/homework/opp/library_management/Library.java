package com.prof.homework.opp.library_management;

public class Library {
    private String name;
    private String address;
    private Librarian[] list;
    private int librarianCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Librarian[] getList() {
        return list;
    }

    public void setList(Librarian[] list) {
        this.list = list;
    }

    public Library(String name, String address, Librarian[] list) {
        this.name = name;
        this.address = address;
        this.list = list;
    }

    public void addLibrarian(Librarian librarian) {
        if (librarianCount < list.length) {
            list[librarianCount] = librarian;
            librarianCount++;
            System.out.println("Librarian : " + librarian.getName() + "add to Library " + name);
        }
    }

    public void findLibrarian(String librarianName) {
        for (int i = 0; i < list.length; i++) {
            Librarian librarian = list[i];
            if (librarian.getName().equals(librarianName)) {
                System.out.printf("Librarian : " + librarian.getName());
            }
        }
        System.out.println("Librarian name : " + librarianName + " is not found");
    }
}


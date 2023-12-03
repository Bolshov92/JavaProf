package com.prof.homework.library_management_system;

public interface Borrowable {

    void borrowItem(User user);

    void returnItem(User user);

    boolean isAvailable();
}

package com.prof.homework._29_11_23;

public interface Borrowable {

    void borrowItem(User user);
    void returnItem(User user);
    boolean isAvailable();
}

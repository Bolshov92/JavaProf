package com.prof.homework.library_management_system;

import java.util.List;

public interface Searchable {

    List<LibraryItem> findByTitle(String title);
    List<LibraryItem> findByAuthor(String author);
    List<LibraryItem> findByGenre(Genre genre);
}

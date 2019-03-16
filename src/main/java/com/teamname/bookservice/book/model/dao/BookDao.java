package com.teamname.bookservice.book.model.dao;

import com.teamname.bookservice.book.model.Book;

import java.util.List;

public interface BookDao {
    Book findById(Long id);

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

    List<Book> findByCategoryId(Long id);

    List<Book> findAll();
}

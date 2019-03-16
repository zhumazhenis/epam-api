package com.teamname.bookservice.model.dao;

import com.teamname.bookservice.model.Book;

public interface BookDao {
    Book findById(Long id);
}

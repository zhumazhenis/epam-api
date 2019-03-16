package com.teamname.bookservice.book.service;


import com.teamname.bookservice.book.model.dao.BookDao;
import com.teamname.bookservice.book.model.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public List<BookDto> findByTile(String title) {
        return bookDao.findByTitle(title).stream().map(BookDto::build).collect(Collectors.toList());
    }

    public List<BookDto> findAll() {
        return bookDao.findAll().stream().map(BookDto::build).collect(Collectors.toList());
    }

    public List<BookDto> findByCategoryId(Long id) {
        return bookDao.findByCategoryId(id).stream().map(BookDto::build).collect(Collectors.toList());
    }
}

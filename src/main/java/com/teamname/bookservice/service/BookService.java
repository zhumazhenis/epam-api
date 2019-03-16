package com.teamname.bookservice.service;


import com.teamname.bookservice.model.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;
}

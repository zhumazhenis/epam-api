package com.teamname.bookservice.book.controller;


import com.teamname.bookservice.book.model.BookDto;
import com.teamname.bookservice.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/books", produces = "application/json")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<BookDto> findByTitle(@RequestParam("title") String title) {
        return bookService.findByTile(title);
    }
}

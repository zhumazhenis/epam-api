package com.teamname.bookservice.book.controller;


import com.teamname.bookservice.book.model.BookDto;
import com.teamname.bookservice.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/books", produces = "application/json")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<BookDto> findByTitle(@RequestParam(value = "title") String title) {
        return bookService.findByTile(title);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    @ResponseBody
    public List<BookDto> findAll() {
        return bookService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{categoryId}")
    @ResponseBody
    public List<BookDto> findByCategoryId(@PathVariable("categoryId") Long id) {
        return bookService.findByCategoryId(id);
    }
}

package com.teamname.bookservice.model.dto;

import com.teamname.bookservice.model.Book;

import java.util.Date;
import java.util.List;

public class CategoryDto {

    public Long id;
    public String name;
    public List<Book> books;
    public Date dateCreated;
    public Date dateModified;
}

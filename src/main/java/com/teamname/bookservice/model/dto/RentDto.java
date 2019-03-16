package com.teamname.bookservice.model.dto;

import com.teamname.bookservice.model.Book;
import com.teamname.bookservice.model.User;

import java.util.Date;

public class RentDto {

    public Long id;
    public Book book;
    public User user;
    public Date dateCreated;
    public Date dateModified;
}

package com.teamname.bookservice.model.dto;

import com.teamname.bookservice.model.Book;
import com.teamname.bookservice.model.User;

import java.util.Date;

public class WishDto {

    public Long id;
    public User user;
    public Book book;
    public Date dateCreated;
    public Date dateModified;
}

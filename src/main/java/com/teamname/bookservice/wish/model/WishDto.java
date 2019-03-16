package com.teamname.bookservice.wish.model;

import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.user.model.User;

import java.util.Date;

public class WishDto {

    public Long id;
    public User user;
    public Book book;
    public Date dateCreated;
    public Date dateModified;
}

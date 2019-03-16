package com.teamname.bookservice.model.dto;

import com.teamname.bookservice.model.Book;
import com.teamname.bookservice.model.User;

import java.util.Date;

public class ReviewDto {

    public Long id;
    public Integer rating;
    public String comment;
    public User user;
    public Book book;
    public Date dateCreated;
    public Date dateModified;
}

package com.teamname.bookservice.review.model;

import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.user.model.User;

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

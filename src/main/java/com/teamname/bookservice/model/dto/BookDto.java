package com.teamname.bookservice.model.dto;

import com.teamname.bookservice.model.Category;
import com.teamname.bookservice.model.User;

import java.util.Date;
import java.util.List;

public class BookDto {

    public Long id;
    public String title;
    public String author;
    public List<Category> categories;
    public String description;
    public User ownerUser;
    public String image;
    public Date dateCreated;
    public Date dateModified;
}

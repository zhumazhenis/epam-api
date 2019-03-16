package com.teamname.bookservice.book.model;

import com.teamname.bookservice.category.model.Category;
import com.teamname.bookservice.user.model.User;

import java.util.Date;
import java.util.List;

public class BookDto {

    public Long id;
    public String title;
    public String author;
    public List<Category> categories;
    public String description;
    public String image;
    public Date dateCreated;
    public Date dateModified;

    public static BookDto build(Book book) {
        BookDto bookDto = new BookDto();

        bookDto.id = book.getId();
        bookDto.author = book.getAuthor();
        bookDto.categories = book.getCategories();
        bookDto.description = book.getDescription();
        bookDto.title = book.getTitle();
        bookDto.dateCreated = book.getDateCreated();
        bookDto.dateModified = book.getDateModified();

        return bookDto;
    }
}

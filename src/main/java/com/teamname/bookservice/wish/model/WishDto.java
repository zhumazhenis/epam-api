package com.teamname.bookservice.wish.model;

import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.user.model.User;

import java.util.Date;

public class WishDto {

    public Long userId;
    public Long bookId;
    public String title;
    public String author;
    public String description;
    public String image;
    public Integer year;

    public static WishDto build(Wish wish) {
        WishDto wishDto = new WishDto();
        wishDto.title = wish.getBook().getTitle();
        wishDto.author = wish.getBook().getAuthor();
        wishDto.description = wish.getBook().getDescription();
        wishDto.author = wish.getBook().getAuthor();

        return wishDto;
    }
}

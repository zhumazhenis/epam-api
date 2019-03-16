package com.teamname.bookservice.rent.model;


import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.user.model.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "own_")
public class Own {

    private Long id;
    private User user;
    private Book book;
    private Integer count;
    private Date dateCreated;
    private Date dateModified;


    @Id
    @GeneratedValue
    @Column(name = "id_")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id_")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(targetEntity = Book.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id_")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Column(name = "count_")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Column(name = "date_created_")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Column(name = "date_modified_")
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}

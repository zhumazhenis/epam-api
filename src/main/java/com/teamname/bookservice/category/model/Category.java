package com.teamname.bookservice.category.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.teamname.bookservice.book.model.Book;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category_")
public class Category {

    private Long id;
    private String name;
    private List<Book> books;
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

    @Column(name = "name_")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(targetEntity = Book.class, fetch = FetchType.LAZY)
    @JoinTable(name = "book_category_map_",
        joinColumns = {@JoinColumn(name = "category_id_")},
        inverseJoinColumns = {@JoinColumn(name = "book_id_")})
    @JsonBackReference
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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

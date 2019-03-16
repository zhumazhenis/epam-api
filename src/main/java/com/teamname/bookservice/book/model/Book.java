package com.teamname.bookservice.book.model;


import com.teamname.bookservice.category.model.Category;
import com.teamname.bookservice.user.model.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "book_")
public class Book {

    private Long id;
    private String title;
    private String author;
    private List<Category> categories;
    private String description;
    private User ownerUser;
    private String image;
    private Integer year;
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

    @Column(name = "title_")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author_")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @ManyToMany(targetEntity = Category.class, fetch = FetchType.LAZY)
    @JoinTable(name = "book_category_map_",
        joinColumns = {@JoinColumn(name = "book_id_", referencedColumnName = "id_")},
        inverseJoinColumns = {@JoinColumn(name = "category_id_", referencedColumnName = "id_")})
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Column(name = "description_")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_")
    public User getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
    }

    @Column(name = "image_")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "year_")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

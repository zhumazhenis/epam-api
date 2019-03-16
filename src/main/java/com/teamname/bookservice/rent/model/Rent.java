package com.teamname.bookservice.rent.model;

import com.teamname.bookservice.user.model.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rent_")
public class Rent {

    private Long id;
    private Own own;
    private User renterUser;
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

    @ManyToOne(targetEntity = Own.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "own_")
    public Own getOwn() {
        return own;
    }

    public void setOwn(Own own) {
        this.own = own;
    }

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "renter_")
    public User getRenterUser() {
        return renterUser;
    }

    public void setRenterUser(User renterUser) {
        this.renterUser = renterUser;
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

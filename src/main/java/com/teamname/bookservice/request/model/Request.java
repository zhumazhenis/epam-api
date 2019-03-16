package com.teamname.bookservice.request.model;


import com.teamname.bookservice.user.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "request_")
public class Request implements Serializable {

    private Long id;
    private User initiatorUser;
    private User receiverUser;
    private String type;
    private String status;
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
    @JoinColumn(name = "initiator_user_")
    public User getInitiatorUser() {
        return initiatorUser;
    }

    public void setInitiatorUser(User initiatorUser) {
        this.initiatorUser = initiatorUser;
    }

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "receiver_user_")
    public User getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(User receiverUser) {
        this.receiverUser = receiverUser;
    }

    @Column(name = "type_")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "status_")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

package com.teamname.bookservice.request.model;

import com.teamname.bookservice.user.model.User;

import java.util.Date;

public class RequestDto {

    public Long id;
    public User initiatorUser;
    public User receiverUser;
    public String type;
    public String status;
    public Date dateCreated;
    public Date dateModified;
}

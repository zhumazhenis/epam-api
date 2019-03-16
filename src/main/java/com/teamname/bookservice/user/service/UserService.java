package com.teamname.bookservice.user.service;


import com.teamname.bookservice.user.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
}

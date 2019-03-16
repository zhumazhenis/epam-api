package com.teamname.bookservice.model.dao;

import com.teamname.bookservice.model.User;

public interface UserDao {

    User findUserById(Long id);
}

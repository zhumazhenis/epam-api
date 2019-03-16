package com.teamname.bookservice.user.model.dao;

import com.teamname.bookservice.user.model.User;

public interface UserDao {

    User findUserById(Long id);
}

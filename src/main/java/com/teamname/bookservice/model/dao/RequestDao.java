package com.teamname.bookservice.model.dao;

import com.teamname.bookservice.model.Request;

public interface RequestDao {

    Request findById(Long id);
}

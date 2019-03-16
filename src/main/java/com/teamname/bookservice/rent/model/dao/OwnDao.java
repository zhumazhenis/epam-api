package com.teamname.bookservice.rent.model.dao;

import com.teamname.bookservice.rent.model.Own;

import java.util.List;

public interface OwnDao {
    Own findById(Long id);

    List<Own> findByUserId(Long id);

    List<Own> findByBookId(Long id);
}

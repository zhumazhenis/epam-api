package com.teamname.bookservice.wish.model.dao;

import com.teamname.bookservice.wish.model.Wish;

import java.util.List;

public interface WishDao {

    Wish findById(Long id);

    List<Wish> findByUserId(Long id);
}

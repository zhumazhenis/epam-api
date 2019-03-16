package com.teamname.bookservice.rent.model.dao;

import com.teamname.bookservice.rent.model.Rent;

import java.util.List;

public interface RentDao {
    Rent findById(Long id);

    List<Rent> findByRenterUserId(Long id);
}

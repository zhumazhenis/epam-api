package com.teamname.bookservice.wish.service;

import com.teamname.bookservice.wish.model.dao.WishDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishService {

    @Autowired
    WishDao wishDao;
}

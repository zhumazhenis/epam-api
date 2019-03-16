package com.teamname.bookservice.service;

import com.teamname.bookservice.model.dao.WishDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishService {

    @Autowired
    WishDao wishDao;
}

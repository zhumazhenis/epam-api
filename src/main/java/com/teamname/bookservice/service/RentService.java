package com.teamname.bookservice.service;

import com.teamname.bookservice.model.dao.RentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentService {

    @Autowired
    RentDao rentDao;
}

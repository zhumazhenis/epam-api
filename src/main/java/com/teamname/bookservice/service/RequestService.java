package com.teamname.bookservice.service;


import com.teamname.bookservice.model.dao.RequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    RequestDao requestDao;
}

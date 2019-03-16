package com.teamname.bookservice.request.service;


import com.teamname.bookservice.request.model.dao.RequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    RequestDao requestDao;
}

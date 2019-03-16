package com.teamname.bookservice.request.service;


import com.teamname.bookservice.request.model.RequestDto;
import com.teamname.bookservice.request.model.dao.RequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    RequestDao requestDao;

    RequestDto findById(Long id) {
        return null;
    }

    List<RequestDto> findByInitiatorUserId(Long id) {
        return null;
    }

    List<RequestDto> findByReceiverUserId(Long id) {
        return null;
    }
}

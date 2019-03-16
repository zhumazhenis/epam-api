package com.teamname.bookservice.request.model.dao;

import com.teamname.bookservice.request.model.Request;

import java.util.List;

public interface RequestDao {

    Request findById(Long id);

    List<Request> findByInitiatorUserId(Long id);

    List<Request> findByReceiverUserId(Long id);
}

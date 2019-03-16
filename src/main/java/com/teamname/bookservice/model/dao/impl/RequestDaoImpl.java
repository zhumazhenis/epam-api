package com.teamname.bookservice.model.dao.impl;

import com.teamname.bookservice.model.Request;
import com.teamname.bookservice.model.dao.RequestDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class RequestDaoImpl implements RequestDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Request findById(Long id) {
        return em.find(Request.class, id);
    }
}

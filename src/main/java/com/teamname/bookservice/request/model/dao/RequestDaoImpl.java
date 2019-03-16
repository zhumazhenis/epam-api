package com.teamname.bookservice.request.model.dao;

import com.teamname.bookservice.request.model.Request;
import com.teamname.bookservice.request.model.dao.RequestDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class RequestDaoImpl implements RequestDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Request findById(Long id) {
        return em.find(Request.class, id);
    }

    @Override
    public List<Request> findByInitiatorUserId(Long id) {
        return null;
    }

    @Override
    public List<Request> findByReceiverUserId(Long id) {
        return null;
    }
}

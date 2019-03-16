package com.teamname.bookservice.request.model.dao;

import com.teamname.bookservice.request.model.Request;
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
        return em.createQuery("from Request request where request.initiatorUser.id = :id", Request.class)
            .setParameter("id", Request.class)
            .getResultList();
    }

    @Override
    public List<Request> findByReceiverUserId(Long id) {
        return em.createQuery("from Request request where request.receiverUser.id = :id", Request.class)
            .setParameter("id", id)
            .getResultList();
    }
}

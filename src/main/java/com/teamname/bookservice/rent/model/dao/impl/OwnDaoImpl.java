package com.teamname.bookservice.rent.model.dao.impl;


import com.teamname.bookservice.rent.model.Own;
import com.teamname.bookservice.rent.model.dao.OwnDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class OwnDaoImpl implements OwnDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Own findById(Long id) {
        return em.find(Own.class, id);
    }

    @Override
    public List<Own> findByUserId(Long id) {
        return em.createQuery(("from Own own where own.user.id = :id"), Own.class)
            .setParameter("id", id)
            .getResultList();
    }

    @Override
    public List<Own> findByBookId(Long id) {
        return em.createQuery("from Own own where own.book.id = :id", Own.class)
            .setParameter("id", id)
            .getResultList();
    }
}

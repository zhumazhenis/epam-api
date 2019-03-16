package com.teamname.bookservice.model.dao.impl;

import com.teamname.bookservice.model.Wish;
import com.teamname.bookservice.model.dao.WishDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class WishDaoImpl implements WishDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Wish findById(Long id) {
        return em.find(Wish.class, id);
    }
}

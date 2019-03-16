package com.teamname.bookservice.model.dao.impl;

import com.teamname.bookservice.model.Rent;
import com.teamname.bookservice.model.dao.RentDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class RentDaoImpl implements RentDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Rent findById(Long id) {
        return em.find(Rent.class, id);
    }
}

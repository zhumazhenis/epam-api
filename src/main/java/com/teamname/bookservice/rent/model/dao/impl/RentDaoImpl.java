package com.teamname.bookservice.rent.model.dao.impl;

import com.teamname.bookservice.rent.model.Rent;
import com.teamname.bookservice.rent.model.dao.RentDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RentDaoImpl implements RentDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Rent findById(Long id) {
        return em.find(Rent.class, id);
    }

    @Override
    public List<Rent> findByRenterUserId(Long id) {
        return em.createQuery("from Rent rent where rent.renterUser.id = :id", Rent.class)
            .setParameter("id", id)
            .getResultList();
    }
}

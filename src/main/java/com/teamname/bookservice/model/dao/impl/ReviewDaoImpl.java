package com.teamname.bookservice.model.dao.impl;

import com.teamname.bookservice.model.Review;
import com.teamname.bookservice.model.dao.ReviewDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class ReviewDaoImpl implements ReviewDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Review findById(Long id) {
        return em.find(Review.class, id);
    }
}

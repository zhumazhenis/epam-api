package com.teamname.bookservice.review.model.dao;

import com.teamname.bookservice.review.model.Review;
import com.teamname.bookservice.review.model.dao.ReviewDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class ReviewDaoImpl implements ReviewDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Review findById(Long id) {
        return em.find(Review.class, id);
    }

    @Override
    public List<Review> findByBookId(Long id) {
        return null;
    }
}

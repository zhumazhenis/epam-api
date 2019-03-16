package com.teamname.bookservice.wish.model.dao;

import com.teamname.bookservice.wish.model.Wish;
import com.teamname.bookservice.wish.model.dao.WishDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class WishDaoImpl implements WishDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Wish findById(Long id) {
        return em.find(Wish.class, id);
    }

    @Override
    public List<Wish> findByUserId(Long id) {
        return null;
    }
}

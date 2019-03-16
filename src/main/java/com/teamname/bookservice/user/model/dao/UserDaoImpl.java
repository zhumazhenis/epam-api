package com.teamname.bookservice.user.model.dao;

import com.teamname.bookservice.user.model.User;
import com.teamname.bookservice.user.model.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public User findUserById(Long id) {
        return em.find(User.class, id);
    }
}

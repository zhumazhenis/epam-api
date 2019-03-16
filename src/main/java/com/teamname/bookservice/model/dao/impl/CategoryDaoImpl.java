package com.teamname.bookservice.model.dao.impl;

import com.teamname.bookservice.model.Category;
import com.teamname.bookservice.model.dao.CategoryDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Category findById(Long id) {
        return em.find(Category.class, id);
    }
}

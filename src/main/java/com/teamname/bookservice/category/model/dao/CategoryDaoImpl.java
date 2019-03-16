package com.teamname.bookservice.category.model.dao;

import com.teamname.bookservice.category.model.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Category findById(Long id) {
        return em.find(Category.class, id);
    }

    @Override
    public List<Category> findAll() {
        return em.createQuery("from Catergory category", Category.class).getResultList();
    }
}

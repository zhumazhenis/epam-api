package com.teamname.bookservice.model.dao.impl;

import com.teamname.bookservice.model.Book;
import com.teamname.bookservice.model.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Book findById(Long id) {
        return em.find(Book.class, id);
    }
}

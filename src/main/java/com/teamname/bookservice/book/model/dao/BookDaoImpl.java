package com.teamname.bookservice.book.model.dao;

import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.book.model.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Book findById(Long id) {
        return em.find(Book.class, id);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return em.createQuery("select book from Book book where book.title = :title", Book.class)
            .setParameter("title", title)
            .getResultList();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByCategoryId(Long id) {
        return null;
    }

    @Override
    public List<Book> findByOwnerId(Long id) {
        return null;
    }
}

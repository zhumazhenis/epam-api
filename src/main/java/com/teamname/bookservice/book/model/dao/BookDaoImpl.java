package com.teamname.bookservice.book.model.dao;

import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.category.model.Category;
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
        return em.createQuery("select book from Book book where lower(book.title) like concat('%', :title, '%')", Book.class)
            .setParameter("title", title.toLowerCase())
            .getResultList();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return em.createQuery("from Book book where lower(book.author) like concat('%', :author, '%')", Book.class)
            .setParameter("author", author.toLowerCase())
            .getResultList();
    }

    @Override
    public List<Book> findByCategoryId(Long id) {
        return em.find(Category.class, id).getBooks();
    }

    @Override
    public List<Book> findAll() {
        // TODO: sort by RATING instead of TITLE
        return em.createQuery("from Book book order by book.title", Book.class).getResultList();
    }
}

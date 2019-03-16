package com.teamname.bookservice.wish.model.dao;

import com.teamname.bookservice.book.model.Book;
import com.teamname.bookservice.user.model.User;
import com.teamname.bookservice.wish.model.Wish;
import com.teamname.bookservice.wish.model.WishPostDto;
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
        return em.createQuery("from Wish wish where whish.user.id =: id", Wish.class)
            .setParameter("id", id)
            .getResultList();
    }

    @Override
    public Wish save(WishPostDto wishPostDto) {
       Book book = em.find(Book.class, wishPostDto.bookId);
       User user = em.find(User.class, wishPostDto.userId);
       Wish wish = new Wish();
       wish.setBook(book);
       wish.setUser(user);
       em.persist(wish);
       return wish;
    }
}

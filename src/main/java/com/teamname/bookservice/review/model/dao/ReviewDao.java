package com.teamname.bookservice.review.model.dao;

import com.teamname.bookservice.review.model.Review;

import java.util.List;

public interface ReviewDao {

    Review findById(Long id);

    List<Review> findByBookId(Long id);
}

package com.teamname.bookservice.review.service;

import com.teamname.bookservice.review.model.dao.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    ReviewDao reviewDao;
}

package com.teamname.bookservice.category.service;

import com.teamname.bookservice.category.model.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;


}

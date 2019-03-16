package com.teamname.bookservice.category.model.dao;

import com.teamname.bookservice.category.model.Category;

import java.util.List;

public interface CategoryDao {

    Category findById(Long id);

    List<Category> findAll();
}

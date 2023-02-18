package com.example.bakeryShop.service;

import com.example.bakeryShop.entity.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}

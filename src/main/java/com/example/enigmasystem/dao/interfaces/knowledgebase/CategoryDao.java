package com.example.enigmasystem.dao.interfaces.knowledgebase;

import com.example.enigmasystem.models.knowledgebase.Category;

import java.util.List;


public interface CategoryDao {
    Category getCategoryById(int id);
    List<Category> getAll();
}

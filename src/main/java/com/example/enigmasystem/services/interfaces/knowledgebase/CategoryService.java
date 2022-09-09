package com.example.enigmasystem.services.interfaces.knowledgebase;

import com.example.enigmasystem.models.knowledgebase.Category;

import java.util.List;

public interface CategoryService {
    Category getCategoryById(int id);
    List<Category> getAll();
}

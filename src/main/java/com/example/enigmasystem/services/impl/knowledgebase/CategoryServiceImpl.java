package com.example.enigmasystem.services.impl.knowledgebase;

import com.example.enigmasystem.dao.interfaces.knowledgebase.CategoryDao;
import com.example.enigmasystem.models.knowledgebase.Category;
import com.example.enigmasystem.services.interfaces.knowledgebase.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    final CategoryDao categoryDao;

    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}

package com.example.enigmasystem.dao.mock.knowledgebase;

import com.example.enigmasystem.dao.interfaces.knowledgebase.CategoryDao;
import com.example.enigmasystem.models.knowledgebase.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CategoryDaoMock implements CategoryDao {

    List<Category> categories;

    public CategoryDaoMock(){
        categories = new ArrayList<>();
        categories.add(new Category("Персоналии"));
        categories.add(new Category("Дивизионы"));
        categories.add(new Category("Звенья"));
        categories.add(new Category("Другое"));
    }

    @Override
    public Category getCategoryById(int id) {
        return categories.get(id-1);
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }
}

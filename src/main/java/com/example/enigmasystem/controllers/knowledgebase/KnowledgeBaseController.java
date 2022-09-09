package com.example.enigmasystem.controllers.knowledgebase;


import com.example.enigmasystem.models.knowledgebase.Category;
import com.example.enigmasystem.models.knowledgebase.KnowledgeObject;
import com.example.enigmasystem.services.interfaces.knowledgebase.CategoryService;
import com.example.enigmasystem.services.interfaces.knowledgebase.KnowledgeObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/knowledge")
public class KnowledgeBaseController {
    final CategoryService categoryService;
    final KnowledgeObjectService objectService;

    public KnowledgeBaseController(CategoryService categoryService, KnowledgeObjectService objectService) {
        this.categoryService = categoryService;
        this.objectService = objectService;
    }


    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAll();
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable("id") int id){
        return categoryService.getCategoryById(id);
    }

    @GetMapping("/categories/{id}/objects")
    public List<KnowledgeObject> getAllByCategory(@PathVariable("id") int id){
        return objectService.getAllInCategory(categoryService.getCategoryById(id));
    }
}

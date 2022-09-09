package com.example.enigmasystem.dao.interfaces.knowledgebase;

import com.example.enigmasystem.models.knowledgebase.Category;
import com.example.enigmasystem.models.knowledgebase.KnowledgeObject;

import java.util.List;

public interface KnowledgeObjectDao {
    KnowledgeObject getObjectById(int id);
    List<KnowledgeObject> getAllInCategory(Category category);
}

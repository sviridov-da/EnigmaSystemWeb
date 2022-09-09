package com.example.enigmasystem.services.interfaces.knowledgebase;

import com.example.enigmasystem.models.knowledgebase.Category;
import com.example.enigmasystem.models.knowledgebase.KnowledgeObject;

import java.util.List;

public interface KnowledgeObjectService {
    KnowledgeObject getObjectById(int id);
    List<KnowledgeObject> getAllInCategory(Category category);
}

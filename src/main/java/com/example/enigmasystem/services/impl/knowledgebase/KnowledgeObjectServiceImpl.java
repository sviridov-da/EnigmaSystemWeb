package com.example.enigmasystem.services.impl.knowledgebase;

import com.example.enigmasystem.dao.interfaces.knowledgebase.KnowledgeObjectDao;
import com.example.enigmasystem.models.knowledgebase.Category;
import com.example.enigmasystem.models.knowledgebase.KnowledgeObject;
import com.example.enigmasystem.services.interfaces.knowledgebase.KnowledgeObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeObjectServiceImpl implements KnowledgeObjectService {
    final KnowledgeObjectDao objectDao;

    public KnowledgeObjectServiceImpl(KnowledgeObjectDao objectDao) {
        this.objectDao = objectDao;
    }


    @Override
    public KnowledgeObject getObjectById(int id) {
        return objectDao.getObjectById(id);
    }

    @Override
    public List<KnowledgeObject> getAllInCategory(Category category) {
        return objectDao.getAllInCategory(category);
    }
}

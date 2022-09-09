package com.example.enigmasystem.dao.mock.knowledgebase;

import com.example.enigmasystem.dao.interfaces.knowledgebase.KnowledgeObjectDao;
import com.example.enigmasystem.models.knowledgebase.Category;
import com.example.enigmasystem.models.knowledgebase.KnowledgeObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class KnowledgeObjectDaoMock implements KnowledgeObjectDao {
    List<KnowledgeObject> objects;
    CategoryDaoMock categoryDao;

    public KnowledgeObjectDaoMock(CategoryDaoMock categoryDao){
        objects = new ArrayList<>();
        objects.add(new KnowledgeObject("Айзек Наруд", "Айзек описание", categoryDao.getCategoryById(1)));
        objects.add(new KnowledgeObject("Система", "Описание дивизиона Система", categoryDao.getCategoryById(2)));
        objects.add(new KnowledgeObject("Звено-1", "Описание Звена-1", categoryDao.getCategoryById(3)));
        objects.add(new KnowledgeObject("Инициатива Мёбиус", "ыпквпыупы", categoryDao.getCategoryById(4)));
        this.categoryDao = categoryDao;
    }


    @Override
    public KnowledgeObject getObjectById(int id) {
        return objects.get(id-1);
    }

    @Override
    public List<KnowledgeObject> getAllInCategory(Category category) {
        return objects.stream().filter(o -> o.getCategory().equals(category)).collect(Collectors.toList());
    }
}

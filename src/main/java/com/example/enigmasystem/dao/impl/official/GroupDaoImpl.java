package com.example.enigmasystem.dao.impl.official;

import com.example.enigmasystem.dao.impl.AbstractDaoImpl;
import com.example.enigmasystem.dao.interfaces.official.GroupDao;
import com.example.enigmasystem.models.official.CampGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupDaoImpl extends AbstractDaoImpl implements GroupDao {
    @Override
    public List<CampGroup> getAllGroups() {
        return entityManager.createQuery("SELECT cg FROM CampGroup cg").getResultList();
    }

    @Override
    public CampGroup getById(long id) {
        return entityManager.find(CampGroup.class, id);
    }
}

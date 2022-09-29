package com.example.enigmasystem.dao.impl.official;

import com.example.enigmasystem.dao.impl.AbstractDaoImpl;
import com.example.enigmasystem.dao.interfaces.official.CampDao;
import com.example.enigmasystem.models.official.Camp;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CampDaoImpl extends AbstractDaoImpl implements CampDao {

    @Override
    public List<Camp> getAllCamps() {
        return entityManager.createQuery("SELECT camp FROM Camp camp ORDER BY camp.startDate").getResultList();
    }

    @Override
    public Camp getById(long id) {
        return entityManager.find(Camp.class, id);
    }
}

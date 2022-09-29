package com.example.enigmasystem.dao.interfaces.official;
import com.example.enigmasystem.models.official.CampGroup;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface GroupDao {
    List<CampGroup> getAllGroups();
    CampGroup getById(long id);
}

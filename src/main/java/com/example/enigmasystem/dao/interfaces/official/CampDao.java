package com.example.enigmasystem.dao.interfaces.official;

import com.example.enigmasystem.models.official.Camp;

import java.util.List;

public interface CampDao {
    List<Camp> getAllCamps();
    Camp getById(long id);
}

package com.example.enigmasystem.services.interfaces.official;

import com.example.enigmasystem.dto.official.CampDto;
import com.example.enigmasystem.models.official.Camp;

import java.util.List;

public interface CampService {
    List<CampDto> getAllCamps();
    CampDto getById(long id);
}

package com.example.enigmasystem.services.interfaces.official;

import com.example.enigmasystem.dto.official.CampGroupDto;
import com.example.enigmasystem.models.official.Camp;

import java.util.List;

public interface GroupService {
    public List<CampGroupDto> getAll();
    public List<CampGroupDto> getByCampId(long campId);
    public CampGroupDto getById(long id);
}

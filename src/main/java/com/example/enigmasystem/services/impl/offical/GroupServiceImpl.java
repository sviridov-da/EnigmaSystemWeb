package com.example.enigmasystem.services.impl.offical;

import com.example.enigmasystem.dao.interfaces.official.CampDao;
import com.example.enigmasystem.dao.interfaces.official.GroupDao;
import com.example.enigmasystem.dto.official.CampGroupDto;
import com.example.enigmasystem.models.official.Camp;
import com.example.enigmasystem.models.official.CampGroup;
import com.example.enigmasystem.services.interfaces.official.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {
    final
    GroupDao groupDao;
    final
    CampDao campDao;

    public GroupServiceImpl(CampDao campDao, GroupDao groupDao) {
        this.campDao = campDao;
        this.groupDao = groupDao;
    }

    @Override
    public List<CampGroupDto> getAll() {
        return groupDao.getAllGroups().stream().map(CampGroup::toDto).collect(Collectors.toList());
    }

    @Override
    public List<CampGroupDto> getByCampId(long campId) {
        return groupDao.getAllGroups().stream()
                .filter(group -> group.getCamp().equals(campDao.getById(campId)))
                .map(CampGroup::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CampGroupDto getById(long id) {
        return groupDao.getById(id).toDto();
    }
}

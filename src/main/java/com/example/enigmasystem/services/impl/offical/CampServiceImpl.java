package com.example.enigmasystem.services.impl.offical;

import com.example.enigmasystem.dao.interfaces.official.CampDao;
import com.example.enigmasystem.dto.official.CampDto;
import com.example.enigmasystem.models.official.Camp;
import com.example.enigmasystem.services.interfaces.official.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CampServiceImpl implements CampService {
    @Autowired
    private CampDao campDao;


    @Override
    @Transactional(readOnly = true)
    public List<CampDto> getAllCamps() {
        return campDao.getAllCamps().stream().map(Camp::toDto).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public CampDto getById(long id) {
        return campDao.getById(id).toDto();
    }
}

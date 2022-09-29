package com.example.enigmasystem.controllers.restapi.official;

import com.example.enigmasystem.dto.official.CampDto;
import com.example.enigmasystem.models.official.Camp;
import com.example.enigmasystem.services.interfaces.official.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/camps")
public class CampController {
    final
    CampService campService;

    public CampController(CampService campService) {
        this.campService = campService;
    }

    @GetMapping
    public List<CampDto> getAllCamps(){
        return campService.getAllCamps();
    }

    @GetMapping("/{id}")
    public CampDto getById(@PathVariable("id") long id){
        return campService.getById(id);
    }
}

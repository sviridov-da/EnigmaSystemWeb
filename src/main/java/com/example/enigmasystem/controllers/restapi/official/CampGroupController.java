package com.example.enigmasystem.controllers.restapi.official;

import com.example.enigmasystem.dto.official.CampGroupDto;
import com.example.enigmasystem.services.interfaces.official.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class CampGroupController {
    final
    GroupService groupService;

    public CampGroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public List<CampGroupDto> getAll(@Nullable @RequestParam("camp_id") Long id){
        if(id == null) {
            return groupService.getAll();
        }
        return groupService.getByCampId(id);
    }

}

package com.example.enigmasystem.controllers.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/camps")
public class CampMainController {
    @GetMapping
    public String showCamps(){
        return "camp/main-camps";
    }

    @GetMapping("/{id}")
    public String showCampById(){
        return "camp/camp-page";
    }
}

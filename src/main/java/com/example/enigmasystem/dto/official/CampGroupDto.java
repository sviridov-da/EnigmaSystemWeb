package com.example.enigmasystem.dto.official;

import javax.persistence.Column;

public class CampGroupDto {
    long id;
    String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

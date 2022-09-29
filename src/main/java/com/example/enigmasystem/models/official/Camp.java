package com.example.enigmasystem.models.official;

import com.example.enigmasystem.dto.official.CampDto;
import com.example.enigmasystem.dto.official.CampGroupDto;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Camp {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "camp_title")
    private String title;

    @Column(name = "camp_desc")
    private String description;

    @Column(name = "image_title")
    private String image;


    @Column(name = "start_date")
    LocalDate startDate;

    @OneToMany
    @JoinColumn(name = "camp_id")
    @Fetch(FetchMode.SUBSELECT)
    private List<CampGroup> groups;

    public Camp() {
    }


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

    public List<CampGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<CampGroup> groups) {
        this.groups = groups;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public CampDto toDto(){
        CampDto dto = new CampDto();
        dto.setId(id);
        dto.setTitle(title);
        dto.setDescription(description);
        dto.setImage(image);
        dto.setStartDate(startDate);
        return dto;
    }

    public void fromDto(CampDto dto){
        title = dto.getTitle();
        description = dto.getDescription();
        image = dto.getImage();
        startDate = dto.getStartDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camp camp = (Camp) o;
        return id == camp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

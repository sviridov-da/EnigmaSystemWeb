package com.example.enigmasystem.models.official;

import com.example.enigmasystem.dto.official.CampGroupDto;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class CampGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @Column(name = "camp_title")
    String title;

    @ManyToOne
    Camp camp;

    @ManyToMany(mappedBy = "groups")
    Set<Child> children;

    public CampGroup() {
    }

    public CampGroup(String title, Camp camp, Set<Child> children) {
        this.title = title;
        this.camp = camp;
        this.children = children;
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

    public Camp getCamp() {
        return camp;
    }

    public void setCamp(Camp camp) {
        this.camp = camp;
    }

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    public CampGroupDto toDto(){
        CampGroupDto dto = new CampGroupDto();
        dto.setId(id);
        dto.setTitle(title);
        return dto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampGroup group = (CampGroup) o;
        return id == group.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

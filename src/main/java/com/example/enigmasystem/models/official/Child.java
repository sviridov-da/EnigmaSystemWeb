package com.example.enigmasystem.models.official;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @Column(name = "full_name")
    String fullName;

    @ManyToMany
    @JoinTable(name = "groups_children",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    Set<CampGroup> groups;

    public Child() {
    }

    public Child(String fullName, Set<CampGroup> groups) {
        this.fullName = fullName;
        this.groups = groups;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<CampGroup> getGroups() {
        return groups;
    }

    public void setGroups(Set<CampGroup> groups) {
        this.groups = groups;
    }
}

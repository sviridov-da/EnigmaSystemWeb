package com.example.enigmasystem.models.knowledgebase;

public class KnowledgeObject {
    private String title;
    private String description;
    private Category category;

    public KnowledgeObject() {
    }

    public KnowledgeObject(String title, String description, Category category) {
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

package com.example.pasteleria.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcategoryName() {
        return categoryName;
    }

    public void setcategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

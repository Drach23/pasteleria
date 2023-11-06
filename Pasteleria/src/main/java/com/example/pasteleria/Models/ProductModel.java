package com.example.pasteleria.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Integer id;
    private String nombre;
    private float precio;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private CategoryModel categoria;

}

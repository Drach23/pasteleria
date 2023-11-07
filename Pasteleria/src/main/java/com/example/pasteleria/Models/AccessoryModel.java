package com.example.pasteleria.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "accesorios")
public class AccessoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long id;
    private String nombre;
    private String descripcion;
    private float costoAdicional;
    private String status;
    //Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(float costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

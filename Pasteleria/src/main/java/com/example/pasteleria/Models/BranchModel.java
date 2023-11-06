package com.example.pasteleria.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "sucursales")
public class BranchModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Integer id;
    private String nombre;
    private String email;
    private String telefono;
    private String estadoOperativo;

    //setter y getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstadoOperativo() {

        return estadoOperativo;
    }

    public void setEstadoOperativo(String estadoOperativo) {

        this.estadoOperativo = estadoOperativo;
    }
}

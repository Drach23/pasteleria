package com.example.pasteleria.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UserModel usuario;
    private Date fechaPedido;

    @ManyToOne
    @JoinColumn(name = "idSucursal")
    private AdressBranchModel adressBranch;

    private String metodoPago;
    private float total;


    //setter y getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public AdressBranchModel getAdressBranch() {
        return adressBranch;
    }

    public void setAdressBranch(AdressBranchModel adressBranch) {
        this.adressBranch = adressBranch;
    }
}

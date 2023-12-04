package com.example.pasteleria.Models;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "envio")
public class DeliveryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private OrderModel order;

    private String status;
    private Date fechaEntrega;
    private Time horaEntrega;
    @ManyToOne
    @JoinColumn(name = "id_user_adress")
    private UserAddressModel adressUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderModel getOrder() {
        return order;
    }

    public void setOrder(OrderModel order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Time getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Time horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public UserAddressModel getAdressUser() {
        return adressUser;
    }

    public void setAdressUser(UserAddressModel adressUser) {
        this.adressUser = adressUser;
    }
}

package com.example.pasteleria.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "accesorioProducto")
public class AccessoryProductModel {
    @EmbeddedId
    private AccessoryProductModelId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "ordenId")
    private OrderModel orden;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "productoId")
    private ProductModel producto;

    @ManyToOne
    @MapsId("AccesoryId")
    @JoinColumn(name = "accesorioId")
    private AccessoryModel accesory;

    public AccessoryProductModelId getId() {
        return id;
    }

    public void setId(AccessoryProductModelId id) {
        this.id = id;
    }

    public OrderModel getOrden() {
        return orden;
    }

    public void setOrden(OrderModel orden) {
        this.orden = orden;
    }

    public ProductModel getProducto() {
        return producto;
    }

    public void setProduct(ProductModel product) {
        this.producto = product;
    }

    public AccessoryModel getAccesory() {
        return accesory;
    }

    public void setAccesory(AccessoryModel accesory) {
        this.accesory = accesory;
    }

    @Embeddable
    public static class AccessoryProductModelId implements Serializable {
        private Long orderId;
        private Long productId;
        private Long AccesoryId;

        //getters y setters


        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public Long getAccesoryId() {
            return AccesoryId;
        }

        public void setAccesoryId(Long accesoryId) {
            AccesoryId = accesoryId;
        }
    }
}

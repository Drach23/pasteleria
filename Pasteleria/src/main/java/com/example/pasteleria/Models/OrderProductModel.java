package com.example.pasteleria.Models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;

import java.io.Serializable;

@Entity
@Table(name = "pedidoProducto")
public class OrderProductModel {
    @EmbeddedId
    private OrderProductModelId id;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "id_producto")
    private ProductModel product;



    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "id_pedido")
    private OrderModel order;
    private Integer cantidad;

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public OrderModel getOrder() {
        return order;
    }

    public void setOrder(OrderModel order) {
        this.order = order;
    }
    public OrderProductModelId getId() {
        return id;
    }

    public void setId(OrderProductModelId id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Embeddable
    public static class OrderProductModelId implements Serializable {
        private Long productId;
        private Long orderId;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }
    }

}

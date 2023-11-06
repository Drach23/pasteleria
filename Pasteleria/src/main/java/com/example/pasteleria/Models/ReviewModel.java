package com.example.pasteleria.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "reviews")
public class ReviewModel {

    @EmbeddedId
    private ReviewModelId id;

    @ManyToOne
    @MapsId("userId") // Mapeo de la clave foránea a la clave primaria compuesta
    @JoinColumn(name = "idUserReview")
    private UserModel usuario;

    @ManyToOne
    @MapsId("productId") // Mapeo de la clave foránea a la clave primaria compuesta
    @JoinColumn(name = "idProductReview")
    private ProductModel product;

    private short calificacion;
    private String comentario;
    private Date fechaCreacion;

    //getters y setters
    public ReviewModelId getId() {
        return id;
    }

    public void setId(ReviewModelId id) {
        this.id = id;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public short getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(short calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Embeddable
    public static class ReviewModelId implements Serializable {
        private Integer userId;
        private Integer productId;

        // Constructores, getters y setters
        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }
    }
}


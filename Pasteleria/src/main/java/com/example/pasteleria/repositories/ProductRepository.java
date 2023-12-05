package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.ProductModel;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel,Long> {
    List<ProductModel> findByCategoriaId(Long categoriaId);
}

package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel,Integer> {

}

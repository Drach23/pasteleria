package com.example.pasteleria.repositories;


import com.example.pasteleria.Models.OrderProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends CrudRepository<OrderProductModel,Long> {

}

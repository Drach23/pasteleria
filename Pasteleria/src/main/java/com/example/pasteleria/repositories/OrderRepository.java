package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderModel, Long> {

}

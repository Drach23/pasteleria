package com.example.pasteleria.repositories;


import com.example.pasteleria.Models.OrderProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderProductRepository extends CrudRepository<OrderProductModel,OrderProductModel.OrderProductModelId> {
    Optional<OrderProductModel> findById(OrderProductModel.OrderProductModelId orderProductModelId);
}

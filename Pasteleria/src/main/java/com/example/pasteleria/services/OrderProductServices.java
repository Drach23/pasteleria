package com.example.pasteleria.services;

import com.example.pasteleria.Models.OrderProductModel;
import com.example.pasteleria.repositories.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderProductServices {
    @Autowired
    OrderProductRepository orderProductRepository;

    //obtener todos las ordenes con producto registradas.
    public ArrayList<OrderProductModel> findAllOrderProducts() {
        return (ArrayList<OrderProductModel>) orderProductRepository.findAll();
    }

    //Guardar una nueva orden con producto.
    public OrderProductModel saveOrderProduct(OrderProductModel orderProduct) {
        return orderProductRepository.save(orderProduct);
    }

    //Buscar un OrdenConProducto
    public Optional<OrderProductModel> findById(OrderProductModel.OrderProductModelId orderProductModelId) {
        return this.orderProductRepository.findById(orderProductModelId);
    }

    public Boolean deleteById(OrderProductModel.OrderProductModelId orderProductModelId) {
        Optional<OrderProductModel> optionalOrderProduct = orderProductRepository.findById(orderProductModelId);
        if (optionalOrderProduct.isPresent()) {
            orderProductRepository.delete(optionalOrderProduct.get());
            return true;
        }
        return false;
    }
}

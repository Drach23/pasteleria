package com.example.pasteleria.services;

import com.example.pasteleria.Models.OrderProductModel;
import com.example.pasteleria.repositories.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderProductServices {
    @Autowired
    OrderProductRepository orderProductRepository;
    //obtener todos las ordenes con producto registradas.
    public ArrayList<OrderProductModel> findAllOrderProducts(){
        return (ArrayList<OrderProductModel>) orderProductRepository.findAll();
    }
    //Guardar una nueva orden con producto.
    public OrderProductModel saveOrderProduct(OrderProductModel orderProduct){
        return orderProductRepository.save(orderProduct);
    }
}

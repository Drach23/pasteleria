package com.example.pasteleria.services;

import com.example.pasteleria.Models.OrderModel;
import com.example.pasteleria.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class OrderServices {
    @Autowired
    OrderRepository orderRepository;
    //obtener todos los usuarios registrados
    public ArrayList<OrderModel> findAllOrders(){
        return (ArrayList<OrderModel>) orderRepository.findAll();
    }
    //Guardar un usuario
    public OrderModel saveOrder(OrderModel order){
        return orderRepository.save(order);
    }
}

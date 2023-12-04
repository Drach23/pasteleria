package com.example.pasteleria.services;

import com.example.pasteleria.Models.OrderModel;
import com.example.pasteleria.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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
    //editar un un usuario mediante ID
    public Optional<OrderModel> findOrderById(Long id){
        return orderRepository.findById(id);
    }
    public boolean deleteOrder(Long id){
        try{
            orderRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

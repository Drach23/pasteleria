package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.OrderModel;
import com.example.pasteleria.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderServices orderService;
    //get
    @GetMapping()
        public ArrayList<OrderModel> findAllOrders(){
        return orderService.findAllOrders();
    }
    //post
    @PostMapping
    public OrderModel saveOrder(@RequestBody OrderModel order){
        return orderService.saveOrder(order);
    }
}

package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.OrderModel;
import com.example.pasteleria.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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
    //put
    @PutMapping
    public OrderModel updateOrder(@RequestBody OrderModel order){
        return orderService.saveOrder(order);
    }

    //encontrar por orden por id
    @GetMapping(path = "/findById")
    public Optional<OrderModel> findOrderById(@RequestParam("id")Long id){
        return this.orderService.findOrderById(id);
    }
    @DeleteMapping(path = "/deleteById")
    public Boolean deleteOrder(@RequestParam("id")Long id){
        return this.orderService.deleteOrder(id);
    }
}

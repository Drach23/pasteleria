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
    @GetMapping()// http://localhost:8080/order
        public ArrayList<OrderModel> findAllOrders(){
        return orderService.findAllOrders();
    }
    //post
    @PostMapping() // http://localhost:8080/order
    public OrderModel saveOrder(@RequestBody OrderModel order){
        return orderService.saveOrder(order);
    }
    //put
    @PutMapping() // http://localhost:8080/order
    public OrderModel updateOrder(@RequestBody OrderModel order){
        return orderService.saveOrder(order);
    }

    //encontrar por orden por id
    @GetMapping(path = "/findById") // http://localhost:8080/order/findById?id=1
    public Optional<OrderModel> findOrderById(@RequestParam("id")Long id){
        return this.orderService.findOrderById(id);
    }
    @DeleteMapping(path = "/deleteById")// http://localhost:8080/order/deleteById?id=1
    public Boolean deleteOrder(@RequestParam("id")Long id){
        return this.orderService.deleteOrder(id);
    }
}

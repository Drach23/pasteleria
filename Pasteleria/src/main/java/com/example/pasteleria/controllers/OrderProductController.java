package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.OrderProductModel;
import com.example.pasteleria.services.OrderProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/orderProduct")
public class OrderProductController {
    @Autowired
    OrderProductServices orderProductService;
    //get
    @GetMapping()
    public ArrayList<OrderProductModel> findAllOrderProducts(){
        return orderProductService.findAllOrderProducts();
    }
    @PostMapping()
    public OrderProductModel saveOrderProduct(@RequestBody OrderProductModel orderProduct) {
        return orderProductService.saveOrderProduct(orderProduct);
    }
}

package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.OrderProductModel;
import com.example.pasteleria.services.OrderProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/orderProduct")
public class OrderProductController {
    @Autowired
    OrderProductServices orderProductService;

    //get
    @GetMapping()
    public ArrayList<OrderProductModel> findAllOrderProducts() {

        return orderProductService.findAllOrderProducts();
    }

    @PostMapping()
    public OrderProductModel saveOrderProduct(@RequestBody OrderProductModel orderProduct) {
        return orderProductService.saveOrderProduct(orderProduct);
    }

    //put
    @PutMapping()
    public OrderProductModel updateOrderProduct(@RequestBody OrderProductModel orderProduct) {
        return orderProductService.saveOrderProduct(orderProduct);
    }

    //findById
    @GetMapping(path = "/findById")
    public Optional<OrderProductModel> findById(
            @RequestParam("productId") Long productId,
            @RequestParam("orderId") Long orderId
    ) {
        OrderProductModel.OrderProductModelId orderProductModelId = new OrderProductModel.OrderProductModelId();
        orderProductModelId.setOrderId(orderId);
        orderProductModelId.setProductId(productId);
        return this.orderProductService.findById(orderProductModelId);

    }

    //deleteById
    @DeleteMapping(path = "/deleteById")
    public String deleteById(
            @RequestParam("productId") Long productId,
            @RequestParam("orderId") Long orderId
    ) {
        OrderProductModel.OrderProductModelId orderProductModelId = new OrderProductModel.OrderProductModelId();
        orderProductModelId.setProductId(productId);
        orderProductModelId.setOrderId(orderId);

         boolean deleted = orderProductService.deleteById(orderProductModelId);
        if (deleted) {
            return "Order with productId: " + productId + " and orderId: " + orderId + " deleted successfully";
        } else {
            return "order with productId: " + productId + " and orderId: " + orderId + " not found or couldn't be deleted";
        }
    }
}

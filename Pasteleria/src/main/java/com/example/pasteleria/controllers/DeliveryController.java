package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.DeliveryModel;
import com.example.pasteleria.services.DeliveryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/deliverys")
public class DeliveryController {
    @Autowired
    DeliveryServices deliveryService;

    @GetMapping()
    public ArrayList<DeliveryModel> findAllDeliverys() {
        return deliveryService.findAllDeliverys();
    }

    @PostMapping
    public DeliveryModel saveDelivery(@RequestBody DeliveryModel delivery) {
        return deliveryService.saveDelivery(delivery);
    }
}

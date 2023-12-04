package com.example.pasteleria.controllers;

import com.example.pasteleria.Models.DeliveryModel;
import com.example.pasteleria.services.DeliveryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/deliverys")
public class DeliveryController {
    @Autowired
    DeliveryServices deliveryService;

    //toma todos los envios
    @GetMapping()//http://localhost:8080/deliverys
    public ArrayList<DeliveryModel> findAllDeliverys() {
        return deliveryService.findAllDeliverys();
    }

    //guarda un envio nuevo
    @PostMapping() // http://localhost:8080/deliverys
    public DeliveryModel saveDelivery(@RequestBody DeliveryModel delivery) {
        return deliveryService.saveDelivery(delivery);
    }
    //edita un envio
    @PutMapping()//http://localhost:8080/deliverys
    public DeliveryModel updateDelivery(@RequestBody DeliveryModel delivery) {
        return deliveryService.saveDelivery(delivery);
    }

    //obtiene un envio por su id
    @GetMapping(path = "/findById") // http://localhost:8080/deliverys/findById?id=6
    public Optional<DeliveryModel> findById(@RequestParam("id")Long id){
        return this.deliveryService.findById(id);
    }
    //elimina un envio por su id
    @DeleteMapping(path = "deleteById") // http://localhost:8080/deliverys/deleteById?id=6
    public boolean deleteDelivery(@RequestParam("id")Long id){
        return this.deliveryService.deleteDelivery(id);
    }
}

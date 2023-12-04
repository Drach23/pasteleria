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
    @GetMapping()
    public ArrayList<DeliveryModel> findAllDeliverys() {
        return deliveryService.findAllDeliverys();
    }

    //guarda un envio nuevo
    @PostMapping()
    public DeliveryModel saveDelivery(@RequestBody DeliveryModel delivery) {
        return deliveryService.saveDelivery(delivery);
    }
    //edita un envio
    @PutMapping()
    public DeliveryModel updateDelivery(@RequestBody DeliveryModel delivery) {
        return deliveryService.saveDelivery(delivery);
    }

    //obtiene un envio por su id
    @GetMapping(path = "/findById")
    public Optional<DeliveryModel> findById(@RequestParam("id")Long id){
        return this.deliveryService.findById(id);
    }
    //elimina un envio por su id
    @DeleteMapping(path = "deleteById")
    public boolean deleteDelivery(@RequestParam("id")Long id){
        return this.deliveryService.deleteDelivery(id);
    }
}

package com.example.pasteleria.services;

import com.example.pasteleria.Models.DeliveryModel;
import com.example.pasteleria.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Service
public class DeliveryServices {
    @Autowired
    DeliveryRepository deliveryRepository;
    //Obtener todas los envios.
    public ArrayList<DeliveryModel> findAllDeliverys(){
        return (ArrayList<DeliveryModel>) deliveryRepository.findAll();
    }
    public DeliveryModel saveDelivery(DeliveryModel delivery){
        return deliveryRepository.save(delivery);
    }

}

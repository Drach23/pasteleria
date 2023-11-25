package com.example.pasteleria.services;

import com.example.pasteleria.Models.DeliveryModel;
import com.example.pasteleria.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DeliveryServices {
    @Autowired
    DeliveryRepository deliveryRepository;
    //Obtener todas los envios.
    public ArrayList<DeliveryModel> findAllDeliverys(){
        return (ArrayList<DeliveryModel>) deliveryRepository.findAll();
    }
    //Guarda un nuevo envio
    public DeliveryModel saveDelivery(DeliveryModel delivery){
        return deliveryRepository.save(delivery);
    }
    //edita un envio
    public Optional<DeliveryModel> findById(Long id){
        return deliveryRepository.findById(id);
    }
    //Eliminar envio por id
    public boolean deleteDelivery(Long id){
        try{
            deliveryRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}

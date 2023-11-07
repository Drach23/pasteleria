package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.DeliveryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends CrudRepository<DeliveryModel,Long> {

}

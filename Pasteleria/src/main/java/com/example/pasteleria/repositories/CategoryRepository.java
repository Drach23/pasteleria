package com.example.pasteleria.repositories;

import com.example.pasteleria.Models.CategoryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel,Long> {

}

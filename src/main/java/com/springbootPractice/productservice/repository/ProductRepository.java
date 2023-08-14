package com.springbootPractice.productservice.repository;


import com.springbootPractice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String>{

}



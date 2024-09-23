package com.tahrioussama.productservice.repos;

import com.tahrioussama.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

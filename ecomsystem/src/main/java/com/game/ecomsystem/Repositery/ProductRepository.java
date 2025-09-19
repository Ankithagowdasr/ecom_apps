package com.game.ecomsystem.Repositery;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.game.ecomsystem.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
}
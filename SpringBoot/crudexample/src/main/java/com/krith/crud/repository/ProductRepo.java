package com.krith.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krith.crud.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	
	Product findByName(String name);
	
}

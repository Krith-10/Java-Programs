package com.krith.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krith.crud.entity.Product;
import com.krith.crud.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return productRepo.saveAll(products);
	}
	
	public List<Product> getProducts() {
		return productRepo.findAll();
	}
	
	public Product getProductById(int id) {
		return productRepo.findById(id).orElse(new Product());
	}
	
	public Product getProductByName(String name) {
		return productRepo.findByName(name);
	}
	
	public void deleteProductById(int id) {
		productRepo.deleteById(id);
	}
	
	public Product updateProduct(Product product) {
		Product currentProduct = productRepo.findById(product.getId()).orElse(null);
		currentProduct.setName(product.getName());
		currentProduct.setPrice(product.getPrice());
		currentProduct.setQuantity(product.getQuantity());
		return productRepo.save(product);
	}
}

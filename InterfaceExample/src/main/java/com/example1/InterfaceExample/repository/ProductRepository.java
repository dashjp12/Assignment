package com.example1.InterfaceExample.repository;

import java.util.List;

import com.example1.InterfaceExample.model.Product;

public interface ProductRepository {
	
	Product addProduct(Product product);
	List<Product> getAllProduct();
	Product getProduct(int id);
	Product removeProduct(int id);

}

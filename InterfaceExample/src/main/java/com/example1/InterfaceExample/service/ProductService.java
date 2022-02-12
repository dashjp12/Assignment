package com.example1.InterfaceExample.service;

import java.util.List;

import com.example1.InterfaceExample.model.Product;

public interface ProductService {
	
	
	Product getProduct(Product product);
	List<Product> getAllProduct();
	Product getProduct(int id);
	Product removeProduct(int id);

}

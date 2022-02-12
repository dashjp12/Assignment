package com.example1.InterfaceExample.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example1.InterfaceExample.model.Product;

@Repository
public class ProductRepository1 implements ProductRepository {
List<Product> alp;
	
	public ProductRepository1(List<Product> alp) {
		super();
		this.alp = alp;
	}
	@Override
	public Product addProduct(Product product) {
		alp.add(product);
		return product;
	}
	@Override
	public List<Product> getAllProduct() {
		return alp;
	}
	@Override
	public Product getProduct(int id) {
		return alp.get(id);
	}
	@Override
	public Product removeProduct(int id) {
		Product te=alp.get(id);
		return alp.remove(id);
		
	}
	
	

}

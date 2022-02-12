package com.example1.InterfaceExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.InterfaceExample.model.Product;
import com.example1.InterfaceExample.repository.ProductRepository1;

@Service
public class ProductService1 implements ProductService {
	
	@Autowired
	ProductRepository1 prodrepo;
	List<Product> alp;
	
	public ProductService1(List<Product> alp) {
		super();
		this.alp = alp;
	}

	@Override
	public Product getProduct(Product product) {
		return prodrepo.addProduct(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return prodrepo.getAllProduct();
	}

	@Override
	public Product getProduct(int id) {
		return prodrepo.getProduct(id);
	}

	@Override
	public Product removeProduct(int id) {
		return prodrepo.getProduct(id);
	}

}

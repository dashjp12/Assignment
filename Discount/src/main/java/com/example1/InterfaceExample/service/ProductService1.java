package com.example1.InterfaceExample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.InterfaceExample.model.Product;
import com.example1.InterfaceExample.repository.ProductRepository;


@Service
public class ProductService1  {
	
	@Autowired
	ProductRepository prodRepo;
	
	public Product addProduct(Product product)
	{
		Product p=prodRepo.save(product);
		return p;
	}
	
	public Optional<Product> getProduct(int id)
	{
		Optional<Product> p=prodRepo.findById(id);
		return p;
	}
	
	public List<Product> getAllProduct()
	{
		List<Product> l=prodRepo.findAll();
		return l;
	}
	
	public Product deleteProduct(int id)
	{
		
		return prodRepo.deleteById(id);
		
	}
	
	public  void updateProduct(Product prod)
	{
		prodRepo.save(prod);
	}
}

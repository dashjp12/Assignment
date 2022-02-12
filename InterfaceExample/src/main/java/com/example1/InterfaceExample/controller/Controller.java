package com.example1.InterfaceExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.InterfaceExample.model.Product;

import com.example1.InterfaceExample.service.ProductService1;

@RestController
public class Controller {
	
	@Autowired
	ProductService1 productservice;
	
	
	
	@PostMapping("/AddProduct")
	public Product AddProduct(@RequestBody Product product)
	{
		return productservice.getProduct(product);
	}
	
	@GetMapping("/AllProduct")
	public List<Product> getAllProduct(){
		return productservice.getAllProduct();
	}
	
	@GetMapping("/Product/{id}")
	public Product getProduct(@PathVariable int id)
	{
		return productservice.getProduct(id);
	}
	
	@DeleteMapping("/product")
	public Product removeProduct(@RequestParam int id)
	{
		return productservice.removeProduct(id);	}

}

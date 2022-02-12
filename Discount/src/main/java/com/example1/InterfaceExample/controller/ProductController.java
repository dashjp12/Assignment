package com.example1.InterfaceExample.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.InterfaceExample.exception.ProductIdInvalidException;
import com.example1.InterfaceExample.model.Product;

import com.example1.InterfaceExample.service.ProductService1;


@RestController
public class ProductController {
	@Autowired
	ProductService1 productservice;

	@PostMapping("/AddProduct")
	public Product AddProduct(@RequestBody Product product)
	{
		return productservice.addProduct(product);
	}
	
	@GetMapping("/GetProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id)
	{
		return productservice.getProduct(id);
	}
	
	@GetMapping("/GetAllProduct")
	public List<Product> getAllProduct()
	{
		return productservice.getAllProduct();
	}
	
	@DeleteMapping("/delete")
	public Product deleteProduct(int id)
	{
		return productservice.deleteProduct(id);
	}
	@PutMapping("/update")
	public void updateProduct(@RequestBody Product prod)
	{
		productservice.updateProduct(prod);
		System.out.println("Data updated");
	}
	

	

}

package com.example1.InterfaceExample.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example1.InterfaceExample.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

//	Product save(Product product);
	Product deleteById(int id);
	
	

}

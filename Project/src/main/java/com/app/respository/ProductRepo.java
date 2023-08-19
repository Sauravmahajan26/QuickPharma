package com.app.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;
import com.app.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{
	
	List<Product> findAll();
	
	
	List<Product> findByProductName(String productName);
	
	List<Product> findByCategory(Category category);
	
	
}

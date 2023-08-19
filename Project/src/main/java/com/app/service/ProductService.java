package com.app.service;

import java.util.List;

import com.app.entities.Category;
import com.app.entities.Product;

public interface ProductService {
	Product addNewProduct(Product product);
	
	List<Product> getProductByCategory(Category cat);
	
	List<Product> getAllProduct();
	
	List<Product> getProductByName(String name);
	
}

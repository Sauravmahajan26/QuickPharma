package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Category;
import com.app.entities.Product;
import com.app.respository.ProductRepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product addNewProduct(Product product) {
		Product pro=productRepo.save(product);
		return pro;
	}

	@Override
	public List<Product> getProductByCategory(Category cat) {
		
		return productRepo.findByCategory(cat) ;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public List<Product> getProductByName(String name) {		
		return productRepo.findByProductName(name);
	}
	
	public String  deleteProduct(Long ProductId) {		
				productRepo.deleteById(ProductId);
				return "Product deleted";
	}
	

}

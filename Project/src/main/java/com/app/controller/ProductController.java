package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Category;
import com.app.service.ProductService;
@RestController
@RequestMapping("/Product")
@Validated
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<?> getAllProduct(){
		return ResponseEntity.status(HttpStatus.FOUND).body(productService.getAllProduct());
	}
	
	@GetMapping("/category")
	public ResponseEntity<?> getProductByCategory(@PathVariable Category cat){
		return ResponseEntity.status(HttpStatus.FOUND).body(productService.getProductByCategory(cat));
	}
	
	@GetMapping("/productName")
	public ResponseEntity<?> getProductByProduct(@PathVariable String productName){
		return ResponseEntity.status(HttpStatus.FOUND).body(productService.getProductByName(productName));
	}
	
	
	
}

package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Category;
import com.app.respository.CategoryRepo;
import com.app.service.CategoryService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Category")
@Validated
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@GetMapping("/categoryId")
	public ResponseEntity<?> getCategory(@PathVariable Long categoryId) {
		return ResponseEntity.status(HttpStatus.FOUND).body(categoryRepo.findByCategoryId(categoryId));
	}
	
	@PutMapping
	public ResponseEntity<?> updateCategory(@RequestBody Category detatchCategory) {
		categoryRepo.findByCategoryId(detatchCategory.getCategoryId());
		categoryService.addNewCategory(detatchCategory);
		return ResponseEntity.ok("Updated.......");
	
//		empService.getEmpDetails(detachedEmp.getId());
//		// => emp exists by the id --> continue to update
//		return empService.addEmpDetails(detachedEmp);
	}
	
	@PostMapping
	public Category addNewCategory(@RequestBody Category category) {	
		System.out.println("Received category: " + category);
		return categoryRepo.save(category);
	}
	
}

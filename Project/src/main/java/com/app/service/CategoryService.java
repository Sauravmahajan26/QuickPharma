package com.app.service;

import com.app.entities.Category;

public interface CategoryService {
	
	Category addNewCategory(Category cat);
	Category saveCategory(Category category);
	
	String delCategory(Long CategoryId);
}


package com.app.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long>{
	Category findByCategoryId(Long Id);
	Category saveCategory(Category category);
	
}

package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Category;
import com.app.respository.CategoryRepo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepo categoryRepo;
	
	
	@Override
	public Category addNewCategory(Category cat) {

		return categoryRepo.save(cat);
		
	}
	@Override
    public Category saveCategory(Category category)
    {
        return categoryRepo.saveCategory(category);
    }


	@Override
	public String delCategory(Long CategoryId) {
		Category cat=categoryRepo.findByCategoryId(CategoryId);
		categoryRepo.delete(cat);
		return "Category deleted";
	}



	
}

package com.example.services;

import java.util.List;

import com.example.payloads.CategoryDto;

public interface CategoryService {
	
	//post
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

	
	//delete
	public void deleteCategory(Integer categoryDto);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	//get all
	List<CategoryDto> getCategories();

}

package com.souk.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souk.shop.model.Category;
import com.souk.shop.repository.CategoryRepository;
import com.souk.shop.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired  
	CategoryRepository cR;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Category> getAllCategories()   
	{
		List<Category> categories = new ArrayList<Category>();  
		cR.findAll().forEach(c -> categories.add(c));  
		return categories;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Category getCategorysById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Category c)   
	{  
		cR.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}
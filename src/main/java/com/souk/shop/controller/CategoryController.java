package com.souk.shop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.souk.shop.model.Category;
import com.souk.shop.service.CategoryService;


@RestController
@CrossOrigin(origins = "*")

public class CategoryController {

	//Attire the ArticlesService class  
	@Autowired  
	CategoryService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Category")

	private List<Category> getAllCategorys()   
	{  
		return cs.getAllCategories();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Category/{id}")  
	private Category getCategorys(@PathVariable("id") int id)   
	{  
		return cs.getCategorysById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Category/{id}")  
	private void deleteCategory(@PathVariable("id") int id)   
	{  
		cs.delete(id);  
	} 

	@PostMapping("/Category")  
	private int saveCategory(@RequestBody Category c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Category")  
	private Category update(@RequestBody  Category c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}


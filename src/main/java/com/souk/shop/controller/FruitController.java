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
import com.souk.shop.model.Fruit;
import com.souk.shop.service.FruitService;


@RestController
@CrossOrigin(origins = "*")

public class FruitController {

	//Attire the ArticlesService class  
	@Autowired  
	FruitService fs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Fruit")

	private List<Fruit> getAllFruits()   
	{  
		return fs.getAllFruits();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Fruit/{id}")  
	private Fruit getFruits(@PathVariable("id") int id)   
	{  
		return fs.getFruitsById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Fruit/{id}")  
	private void deleteFruit(@PathVariable("id") int id)   
	{  
		fs.delete(id);  
	} 

	@PostMapping("/Fruit")  
	private int saveFruit(@RequestBody Fruit f)   
	{  
		fs.saveOrUpdate(f);  
		return f.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Fruit")  
	private Fruit update(@RequestBody  Fruit f)   
	{  
		fs.saveOrUpdate(f);  
		return f;  
	}  
}

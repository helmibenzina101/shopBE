package com.souk.shop.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.souk.shop.model.Fruit;
import com.souk.shop.repository.FruitRepository;

@Service
public class FruitService {

	@Autowired  
	FruitRepository fruitRepository;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Fruit> getAllFruits()   
	{
		List<Fruit> fruits = new ArrayList<Fruit>();  
	  fruitRepository.findAll().forEach(a -> fruits.add(a));  
		return fruits;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Fruit getFruitsById(int id)   
	{  
		return fruitRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fruit c)   
	{  
		fruitRepository.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fruitRepository.deleteById(id);  
	} 
  
}

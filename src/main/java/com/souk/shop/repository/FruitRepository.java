package com.souk.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.souk.shop.model.Fruit;



public interface FruitRepository extends CrudRepository<Fruit, Integer> 
{  
	
}

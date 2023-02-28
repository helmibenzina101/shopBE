package com.souk.shop.repository;

import org.springframework.data.repository.CrudRepository;
import com.souk.shop.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> 
{  
	
}

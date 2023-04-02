package com.DishMenu.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DishMenu.model.DishMenu;

@Repository
public interface DishMenuRepository extends CrudRepository<DishMenu ,Integer> 
{

	
	
}

package com.DishMenu.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DishMenu.model.DishMenu;
import com.DishMenu.repository.DishMenuRepository;


@Service
public class DishMenuService {

	@Autowired
	DishMenuRepository dishMenuRepository;
	
	
//	save
	public void saveDish(DishMenu dishMenu) {
		
		dishMenuRepository.save(dishMenu);
	}
	
	
//	update
//	not used

//	 public void updateDish(DishMenu dishMenu , int id) {
//	  
//	  dishMenuRepository.save(dishMenu); }
//	 
	
//	getAll
	public List<DishMenu> getAllDish(){
		
		List<DishMenu> dishMenus=new ArrayList<DishMenu>();
		
		dishMenuRepository.findAll().forEach(dish ->dishMenus.add(dish));
		return dishMenus;
	}
	
//	getById
	public DishMenu getDishById(int id) {
		return dishMenuRepository.findById(id).get();
	}
	
//	delete
	public void deleteDishById(int id) {
		
		 dishMenuRepository.deleteById(id);
	}
}

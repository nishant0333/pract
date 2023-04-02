package com.DishMenu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DishMenu.model.DishMenu;
import com.DishMenu.service.DishMenuService;
@RestController
public class DishMenuController {

	@Autowired
	DishMenuService dishMenuService;
	
//	save
	@PostMapping("/Dish")
	private int saveDish(@RequestBody DishMenu dishMenu) {
		
		dishMenuService.saveDish(dishMenu);
		return dishMenu.getId();
	}
	
//	update
	@PutMapping("/Dish")
	private DishMenu updateDish(@RequestBody DishMenu dishMenu) {
		
		dishMenuService.saveDish(dishMenu);
		return dishMenu;
	}
	
	//update by id not working
	
//	@PutMapping("/dish/{id}")
//	private DishMenu updateById(@RequestBody DishMenu dishMenu , @PathVariable("id") int id) {
//		dishMenuService.updateDish(dishMenu, id);
//		return dishMenu;
//	}
	
//	getAllDish
	@GetMapping("/Dish")
	private List<DishMenu> getAllDish(){
		
		return dishMenuService.getAllDish();
	}
	
//	getDish
	@GetMapping("/Dish/{id}")
	private DishMenu getDish(@PathVariable("id") int id) {
		return dishMenuService.getDishById(id);
	}
	
//	delete
	@DeleteMapping("/Dish/{id}")
	private void delete(@PathVariable("id") int id ) {
		dishMenuService.deleteDishById(id);
		
	}
}

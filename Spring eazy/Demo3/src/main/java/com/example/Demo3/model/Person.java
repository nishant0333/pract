package com.example.Demo3.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class Person {

	private int id;
	private String name;
	
	@Autowired
	private Vehicle vehicle;
	
	
	
	public Person( Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	
	
	 @PostConstruct public void inite()
	 { 
		 this.id=101; 
		 this.name="Ram"; 
		 }
	 
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	
	public Person(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle=vehicle;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}

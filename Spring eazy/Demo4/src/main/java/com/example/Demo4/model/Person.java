package com.example.Demo4.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
private String name;

@Autowired
@Qualifier("Honda")
private Vehicle vehicle;

public Person(String name, Vehicle vehicle) {
	super();
	this.name = name;
	this.vehicle = vehicle;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Vehicle getVehicle() {
	return vehicle;
}

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
}

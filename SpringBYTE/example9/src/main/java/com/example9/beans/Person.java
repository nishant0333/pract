package com.example9.beans;

import org.springframework.stereotype.Component;


public class Person {
	
private String name;
private Vehicle vehicle;

public Person() {
	System.out.println("person bean created by Spring");
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

package com.example13.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example13.beans.Vehicle;


@Component(value = "personBean")
public class Person {
private String name ="Lucky";
private final Vehicle vehicle;

@Autowired
public Person(Vehicle vehicle) {
	
	this.vehicle = vehicle;
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


}

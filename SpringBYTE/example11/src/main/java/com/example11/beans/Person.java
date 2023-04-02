package com.example11.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name = "nishant";

private Vehicle vehicle;
@Autowired
public Person(Vehicle vehicle) {
	System.out.println("person bean created by Spring");
	this.vehicle= vehicle;
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
@Override
public String toString() {
	return "Person [name=" + name + ", vehicle=" + vehicle + "]";
}
@Bean
public String mi() {
	return "hi test";
}


}

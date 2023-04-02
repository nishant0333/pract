package com.example13.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example13.services.*;


@Component
public class Vehicle {
	
private String name="Honda";
private final VehicleServices vehicleService;

@Autowired
public Vehicle(VehicleServices vehicleService) {
	super();
	this.name = name;
	this.vehicleService = vehicleService;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public VehicleServices getVehicleService() {
	return vehicleService;
}
@Override
public String toString() {
	return "Vehicle [name=" + name + "]";
}
public void printHello() {
	System.out.println("print Hello from component vehicle Bean");
}
}

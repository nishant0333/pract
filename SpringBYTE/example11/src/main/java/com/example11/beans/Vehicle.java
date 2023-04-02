package com.example11.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
private String name = "mahindra";
	public Vehicle() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

}

package com.example9.beans;

import org.springframework.stereotype.Component;


public class Vehicle {

private String name;

public Vehicle() {
	System.out.println("Vehicle bean created by Spring");
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

public void printHello() {
	System.out.println("printing hello from Component Vehicle Bean");
}

}

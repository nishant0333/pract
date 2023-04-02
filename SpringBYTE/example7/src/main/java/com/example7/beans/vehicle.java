package com.example7.beans;

import org.springframework.stereotype.Component;

@Component
public class vehicle {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void printHello() {
	System.out.println("Printing Component Vehicle Bean");
}
}

package com.immutable;

import javax.management.loading.PrivateClassLoader;

public class Address {

private String city;
private String state;



public Address(String city, String state) {
	this.city = city;
	this.state = state;
}
//to give different Address object with copy content of address
//with the help of constructor
public Address(Address address) 
{
this(address.getCity(),address.getState());	
}


public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

//to give different Address object with copy content of address with the help of method
public static Address getInstance(Address address) {
	return new Address(address.getCity(), address.getState());
}
}

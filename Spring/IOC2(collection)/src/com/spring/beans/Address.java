package com.spring.beans;

public class Address {
private String city;
private String street;
private String state;


public Address(String city, String street, String state) {
	super();
	this.city = city;
	this.street = street;
	this.state = state;
}

@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + ", state=" + state + "]";
}
}

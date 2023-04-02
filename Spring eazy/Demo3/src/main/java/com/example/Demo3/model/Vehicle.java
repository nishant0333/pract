package com.example.Demo3.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	
	private String vname;
	public Vehicle( String vname) {
		super();
	
		this.vname = vname;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vehicle [vname=" + vname + "]";
	}
	@PostConstruct
	public void initialize() {
		
		this.vname="Hero";
	}
	
}

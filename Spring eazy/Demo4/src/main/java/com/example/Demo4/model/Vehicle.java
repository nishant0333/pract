package com.example.Demo4.model;

public class Vehicle {
private String vname;

public Vehicle(String vname) {
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

}

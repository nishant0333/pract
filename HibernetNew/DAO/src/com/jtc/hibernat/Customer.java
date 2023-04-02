package com.jtc.hibernat;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="customerDAO")
public class Customer {
//@Id
private int cid;
private String cname;
private String email;
private long phone;
private String city;
private String status;

//Default Constructor
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

//Parameterized constructor
public Customer(int cid, String cname, String email, long phone, String city, String status) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.email = email;
	this.phone = phone;
	this.city = city;
	this.status = status;
}

//Getter and Setter
public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}








}

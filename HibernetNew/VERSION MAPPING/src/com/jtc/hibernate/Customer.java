package com.jtc.hibernate;

public class Customer {
private int cid;
private String cname;
private String email;
private long phone;
private int version;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cid, String cname, String email, long phone) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.email = email;
	this.phone = phone;
	
}
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
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}



	
}

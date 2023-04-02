package com.jtc.hibernate;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.Version;

//@Entity
//@Table(name="customerT")
public class Customer {
//@Id
private int cid;
private String cname;
private String email;
private long phone;
//@Version
//private int version;

//@Temporal(TemporalType.DATE)
private java.util.Date tstamp;

//Default const....
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

//para const...
public Customer(int cid, String cname, String email, long phone) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.email = email;
	this.phone = phone;

	//Geter&Seter
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
//public int getVersion() {
//	return version;
//}
//public void setVersion(int version) {
//	this.version = version;
//}
public java.util.Date getTstamp() {
	return tstamp;
}

public void setTstamp(java.util.Date tstamp) {
	this.tstamp = tstamp;
}	
}

package com.jtcindia;

public class Customer {
private int sid;
private String cname;
private String email;
private long phone;
private String city;

public Customer() {
	// TODO Auto-generated constructor stub
}




public Customer(int sid, String cname, String email, long phone, String city) {
	super();
	this.sid = sid;
	this.cname = cname;
	this.email = email;
	this.phone = phone;
	this.city = city;
}




public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
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

@Override
public String toString() {
	return "Customer [sid=" + sid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
			+ "]";
}


}

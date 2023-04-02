package com.immutable;

final public class Student {
private final String name;
private final Address address;
public Student(String name, Address address) {
	this.name = name;
	this.address = address;
}
public String getName() {
	return name;
}
//get method return Address object with the help of method
//public Address getAddress() {
//	return Address.getInstance(address);
//}

//get method return Address object with the help of constructor
public Address getAddress() {
	return new Address(address);
}
@Override
public String toString() {
	return "Student [name=" + name + ", address=" + address + "]";
}



}

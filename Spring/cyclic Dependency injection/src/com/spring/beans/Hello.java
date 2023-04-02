package com.spring.beans;

public class Hello {
Hai hai;

public void setHai(Hai hai) {
	this.hai = hai;
}

@Override
public String toString() {
	return "Hello [hai=" + hai + "]";
}

public void showHello() {
	System.out.println(hai);
	
}

}

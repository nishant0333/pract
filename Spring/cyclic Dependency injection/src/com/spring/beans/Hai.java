package com.spring.beans;

public class Hai {
	Hello hello;
	public void setHello(Hello hello) {
		this.hello=hello;
	}
//	@Override
//	public String toString() {
//		return "Hai [hello=" + hello + "]";
//	}
//	
	public void showHai() {
		System.out.println(hello);
		
	}
	
}

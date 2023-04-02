package com.immutable;

public class Test_Immutable_Demo {

	public static void main(String[] args) {
		
		Immutable_Demo demo=new Immutable_Demo(12,"name hai",123);
		
		Immutable_Demo demo1=new Immutable_Demo(12,"name hai",123);
		
		System.out.println(demo.hashCode());
		System.out.println(demo1.hashCode());
		
		
		
		//Immutable_Demo modify = demo1.modify(12,"name hai",123);
		
		//System.out.println(modify.hashCode());

	}

}

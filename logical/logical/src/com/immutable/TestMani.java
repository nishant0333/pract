package com.immutable;

public class TestMani {

	public static void main(String[] args) {
		Address address1=new Address("Patna","Bihar");
		
		Student s=new Student("Ganesha", address1);
		
		System.out.println(s.hashCode());
		
		Address address2 = s.getAddress();
		address2.setCity("Lucknow");
		address2.setState("up");
		
		System.out.println(s.hashCode());
		
		System.out.println("address1 :"+address1.hashCode() );
		System.out.println("address2 :"+address2.hashCode() );
	}

}

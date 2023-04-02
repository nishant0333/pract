package com.reflection;
import java.lang.reflect.*;
public abstract class Employee implements java.io.Serializable, Cloneable {

}
 class Test{
	 public static void main(String... arg) throws Exception 
	 {
		Class c=Class.forName("Employee");
		System.out.println("Name : "+c.getName());
		System.out.println("Super class :"+c.getSuperclass().getName());
		
		
		 
	 }
	 
 }
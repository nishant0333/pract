package com.SingaltonNew;

import java.io.Serializable;
//1.make class final so no one inherit it and change functionality
final class SingaltonNew /*extends Thread*/ implements Cloneable,Serializable{
//2.create private static reference variable of the class
	private static SingaltonNew s;
	//3.make constructor of the class private so object can not be create outside the class
	private SingaltonNew () throws Exception {
		
	}
	
	
	//create static method which return type is same class type
	public static SingaltonNew getInstance() throws Exception {
		//Double checked locking to prevent break singleton form Multi Threading 
		if(s==null) {
			//Block level synchronization
			synchronized(SingaltonNew.class){
				if (s==null) {
					 s= new SingaltonNew();
				}
			}	
		}
		
		return s;
		
	}
	
//	public void m1() {
//		System.out.println("testing new singalton");
//	}
	
	
	//Instance initializer Block in java. it is use to initialize object for all constructor 
		//Prevent breaking singleton using Reflection
		{
			if(s!=null) {
				
				throw new Exception("Object is allready present");
			}
		}
		
		//Prevent breaking singleton using De-Serialization
	Object readResolve() {
		return s;
	}
	
	//Prevent breaking singleton using clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Default implementation of clone from object class
		//return super.clone();
		// either we return the same object or throw clone not supported exception
		return s;
		//throw new CloneNotSupportedException();
	}
	
//	@Override
//	public void run() {
//		try {
//			SingaltonNew s7 =(SingaltonNew) SingaltonNew.getInstance();
//			System.out.println(s7.hashCode());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}

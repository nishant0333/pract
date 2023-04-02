package com.test;
class mythread implements Runnable{

	@Override
	public void run() {
		System.out.println("test");
	}
	
	
	
}
public class dell {
	public static void main(String[] args) {
		

mythread t1=new mythread();
Thread t2=new Thread(t1);
     t2.start();
	}
}

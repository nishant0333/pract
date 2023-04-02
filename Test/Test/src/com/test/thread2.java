package com.test;

public class thread2 implements Runnable {
	@Override
		public void run() {
			System.out.println("testing runnable ");
			
		}
public static void main(String[] args) {
	System.out.println("main in thread2");
	thread2 t1=new thread2();
	Thread th=new Thread(t1);
	th.start();
	
}
}

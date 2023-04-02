package com.test;

public class thread1 extends Thread {
 @Override
public void run() {
	System.out.println("testing thread");
}
 
 public static void main(String[] args) {
	thread1 t1=new thread1();
	t1.start();
}
}

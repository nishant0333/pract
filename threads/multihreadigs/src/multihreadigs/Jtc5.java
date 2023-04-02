package multihreadigs;

public class Jtc5 {
public static void main(String[] arg) {
	Hello h=new Hello();
	new X(h,"A");
	new Y(h,"B");
}
}
class Hello{
	synchronized void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println("m1-"+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
	synchronized void m2() {
		for(int i=10;i<=15;i++) {
			System.out.println("m2-"+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
class X implements Runnable{
	Hello h=null;
	X(Hello h,String name){
		this.h=h;
		Thread t=new Thread(this,name);
		t.start();System.out.println(t.getThreadGroup().getName());
	}

public void run() {
	h.m1();
}}
class Y implements Runnable{
	Hello h=null;
	Y(Hello h,String name){
		this.h=h;
		Thread t2=new Thread(this,name);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
		
	}
	public void run() {
		h.m2();
	}
}
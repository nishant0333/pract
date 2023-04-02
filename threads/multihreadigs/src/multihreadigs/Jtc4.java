package multihreadigs;

public class Jtc4 {
public static void main(String[] args) {
	HelloJtc h=new  HelloJtc();
	new A(h,"A");
	new B(h,"B");
}
}
class HelloJtc{
	synchronized void m1() {
	for(int i=1;i<=5;i++) {
		System.out.println("m1-"+i);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
	}
}
synchronized void m2() {
	for(int i=10;i<=5;i++) {
		System.out.println("m2-"+i);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
	}
}
}
class A implements Runnable{
	HelloJtc h=null; 
 A(HelloJtc h,String name){
	 this.h=h;
	 Thread t=new Thread(this,name);
	 t.start();
	 System.out.println(t.getThreadGroup().getName());
 }
 public void run() {
	 h.m1();
 }
}
class B implements Runnable{
	HelloJtc h=null;
	B(HelloJtc h,String name){
		this.h=h;
		Thread t2=new Thread(this,name);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
	}
	public void run() {
		h.m2();
	}
}


















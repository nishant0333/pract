package multihreadigs;
class HelloThread implements Runnable {
	HelloThread(){
		Thread t1=new Thread(this);
		t1.start();
	}
	HelloThread(String tname){
		Thread t2=new Thread(this,tname);
		t2.start();
	}
	HelloThread(String tname,ThreadGroup tg){
		Thread t3=new Thread(tg,this,tname);
		t3.start();
	}
	public void run() {
		for (int i = 0; i<5;i++) {
			System.out.println(Thread.currentThread().getName() +"under the thread group of"
					+ Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			  }
			}
	}
}
public class Jtc103 {
public static void main(String[] args) {
	ThreadGroup tg1=new ThreadGroup("Jtc-pg");
	HelloThread t1=new HelloThread("Jtc-TG");
	HelloThread t2=new HelloThread("Jtc-1");
}
}
class MyThread extends Thread implements Runnable{
	void m1() {
		System.out.println("M1 in MyThread");
	   String tname ="Jtc-ch";
	   Thread t1=new Thread(this);
	   Thread t2=new Thread(this,tname);
	   t1.start();
	   t2.start();
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
		}
	}
	


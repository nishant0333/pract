package multihreadigs;
class HiThread extends Thread{
	public HelloThread() {
	super();
	start();
	
}
public HiThread(String tname) {
	super(tname);
	start();
}
HelloThread(ThreadGroup tg,String tname){
	super(tg,tname);
	start();
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
public class jtc183{
public static void main(String[] args){
	ThreadGroup tg=Thread.currentThread().getThreadGroup();
	HelloThread th1=new HelloThread();
	HelloThread th2=new HelloThread("Jtc-1");
	HelloThread th3=new HelloThread(tg,"jtc-2");
	for(int i = 0; i<5; i++){
		System.out.println(Thread.currentThread().getName() +"under the thread group of"
				+ Thread.currentThread().getThreadGroup().getName());
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}}


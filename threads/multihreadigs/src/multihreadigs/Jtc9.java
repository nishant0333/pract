package multihreadigs;

public class Jtc9 {
public static void main(String args[]) {
	HoJtc h=new HoJtc();
	JtcThread5 jth = new JtcThread5(h);
	jth.setDaemon(true);
	jth.start();
	new Employee();
	System.gc();
	Thread th=Thread.currentThread();
	for(int i = 0;i<15;i++) {
		System.out.println("in Main\t"+h.val+"\t"+th.isDaemon());
		try {
			Thread.sleep(100);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
class JtcThread5 extends Thread{
	HoJtc h=null;
	JtcThread5(HoJtc h){
		this.h=h;
	}
	public void run() {
		for(int i = 0;i <152;i++) {
			h.val=i;
			System.out.println("Storing the Data\t"+i+"\t"+isDaemon());
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class HoJtc{
	int val;
}
class Employee{
	public void finalize() {
		Thread th =Thread.currentThread();
		for(int i =100;i<900;i++) {
			System.out.println(th.getName()+"\t"+th.isDaemon()+"\t"+i);
			try {
				Thread.sleep(100);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	

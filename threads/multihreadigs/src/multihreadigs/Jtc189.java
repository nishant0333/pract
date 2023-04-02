package multihreadigs;
class JtcThread1 extends Thread {
public void run() {
	for (int i=0; i<15;i++) {
System.out.println("JT\t" + 1);
try {
	Thread.sleep(100);
	}catch (Exception e) {
	e.printStackTrace();
}
}
}
}
class JtcThread2 extends Thread {
	Thread th = null; 
	void setThreadTojoin(Thread th) {
	this.th=th;	
	}
	public void run() {
		for (int i=0; i<115; i++) {
		System.out.println("JT2\t" + i);
		try {
			if (i==105) {
				th.join();
			}
			Thread.sleep(100);
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
} 
public class Jtc189 {
public static void main(String[] args) {
	JtcThread1 ath=new JtcThread1();
	JtcThread2 bth= new JtcThread2();
	bth.setThreadTojoin(ath);
	ath.start();
	bth.start();
}
}

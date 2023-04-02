package multihreadigs;

public class Jtc8 {
public static void main(String arg[]) {
	JtcThread3 ath = new JtcThread3();
	JtcThread4 bth = new JtcThread4();
	bth.setThreadToJoin(ath);
	ath.start();
	bth.start();		
}
}
class JtcThread3 extends Thread {
	public void run() {
		for (int i=0;i<15;i++) {
			System.out.println("JTH\t" +i);
			try {
				Thread.sleep(100);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class JtcThread4 extends Thread {
	Thread th = null;
	void setThreadToJoin(Thread th) {
		this.th=th;
	}
	public void run() {
		for(int i=100;i<115;i++) {
			System.out.println("Jth2\t"+i);
			try {
				if(i==105) {
					th.join();
				}
				Thread.sleep(100);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

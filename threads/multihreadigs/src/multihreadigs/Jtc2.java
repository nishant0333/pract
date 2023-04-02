package multihreadigs;
class JtcThread extends Thread{
	public void run() {
		Hello12 h=new Hello12();
		h.show();
	}
}
class Hello12{
	void show() {
		Thread th=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println("Show\t"+i+"\t"+th.getName());
		}
	}
}
public class Jtc2 {
public static void main(String args[])throws ArithmeticException {
JtcThread jt1=new JtcThread();
	jt1.start();
	Thread th=Thread.currentThread();
	for(int i=100;i<110;i++) {
		System.out.println("Main "+i+"\t"+th.getName());
		if(i==105) {
			int x=10/0;
		}
	}
}
}

package Method_Constructor_refrence;

public class ThreadDemoInstance {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
		}
	}

	public static void main(String[] args) {
		ThreadDemoInstance t1 = new ThreadDemoInstance();
		Runnable r = t1::m1;
		Thread t2 = new Thread(r);
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}

	}

}

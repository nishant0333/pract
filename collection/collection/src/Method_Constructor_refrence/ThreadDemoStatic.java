package Method_Constructor_refrence;

public class ThreadDemoStatic {
	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

	public static void main(String... args) {
		Runnable r = ThreadDemoStatic::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}

	}
}

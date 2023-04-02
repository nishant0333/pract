package multihreadigs;

public class Jtc181 {
public static void main(String[] args) {
	Thread th1=new Thread();
	System.out.println(th1);
	String name =th1.getName();
	System.out.println(name);
	int p=th1.getPriority();
	System.out.println(p);
	th1.setName("jtc-th1");
	System.out.println(th1.getName());
	th1.setPriority(9);
	//th1.setPriority(11);
	//th1.setPriority(0);
	System.out.println(th1.getPriority());
	Thread th2=new Thread();
	System.out.println(th2);
	Thread th3=new Thread("Jtc");
	System.out.println(th3);
	for(int i =0;i<5;i++) {
		System.out.println(Thread.currentThread().getName() +"under the thread group of:" +
	Thread.currentThread().getThreadGroup().getName());
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
}

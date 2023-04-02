package multihreadigs;

public class Jtc10 {
public static void main(String arg[]) {
	ThreadGroup tg = new ThreadGroup("B10-12");
	JtcThread6 jth1 = new JthThread6(tg,"JAVA");
	JtcThread6 jth2 = new JthThread6("JDBC");
	jth2.setPriority(9);
	//jth2.setPriority(0);
	JtcThread6 jth3 = new JtcThread6(tg,"EJB");
	jth3.setPriority(2);
	JtcThread6 jth4= new JtcThead6("XML");
	new HelloStudent();
	System.gc();
	jth1.start();
	jth2.start();
	jth3.start();
	jth4.start();
	Thread th =Thread.currentThread();
	ThreadGroup tg1 = th.getThreadGroup();
	System.out.println("IN Main\t:"+tg1.getName());
	try {
		//tg1.stop();
		Thread.sleep(1000);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
class JtcThread6 extends Thread {
	JtcThread6(String name){
		super(name);
	}
	JtcThread6(ThreadGroup tg,String name){
		super(tg,name);
		
	}
	public void run() {
		for(int i = 0;i<10;i++) {
			ThreadGroup tg = getThreadGroup();
			System.out.println(getName()+"\t"+i+getPriority()+"\t"+tg.getName());
			
		}
	}
}
class HelloStudent{
	public void finalize()
{
Thread th = Thread.currentThread();
ThreadGroup tg = th.getThreadGroup();
System.out.println(th.getName()+"\t"+th.getPriority()+"\t"+tg.getName());
JtcThread6 jth1=new JtcThread6("JSP");
jth1.start();
ThreadGroup tg1= new ThreadGroup("JTC");
JtcThread6 jth2 = new JtcThread6(tg1,"-WS");
jth2.start();
}}
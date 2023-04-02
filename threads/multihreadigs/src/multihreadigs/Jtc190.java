package multihreadigs;
class Account{
synchronized void withdraw() {
	for (int i=0;i<5;i++) {
		System.out.println("Withdraw  \t"+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
void deposite() {
	for(int i=0;i<5;i++) {
		System.out.println("Dep[osit    \t   :"+Thread.currentThread().getName());
	}
}
}
class AThread implements Runnable{
	Account acc=null;
	public AThread(Account acc,String tname) {
		this.acc=acc;
		Thread t1=new Thread(this,tname);
		t1.start();
	}
	public void run() {
		acc.withdraw();
	}
}
class BThread implements Runnable{
	Account acc=null;
	public BThread(Account acc,String tname) {
		this.acc=acc;
		Thread t2=new Thread(this,tname);
		t2.start();
	}
	public void run() {
		acc.deposite();
	}
}
public class Jtc190 {
public static void main(String[] args) {
Account acc1=new Account();
Account acc2=new Account();
AThread ath1=new AThread(acc1,"A");
BThread Bth1=new BThread(acc2,"B");
}
}

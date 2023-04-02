package multihreadigs;

public class Jtc6 {
public static void main(String[] args) {
	Acnt acc = new Acnt();
	new AccThread(acc);
}
}
class Acnt {
	int bal=970;
	public void withdraw(int amt) {
		if (bal >=amt) {
			System.out.println(Thread.currentThread().getName()
					+"is going to withdrad..."+ bal);
			try {
				Thread.sleep(1200);
				
			}catch (Exception e) {}
			bal = amt;
			System.out.println(Thread.currentThread().getName()
					+"is Completed withdraw..."+bal);
		}else {
			System.out.println("No Funds for "+Thread.currentThread().getName());
			
		}
	}
	public int getBal() {
		return bal;
	}
}
class AccThread implements Runnable{
	Acnt acc=null;
	AccThread(Acnt acc){
		this.acc=acc;
		Thread t1=new Thread(this, "A");
		Thread t2=new Thread(this, "B");
		t1.start();
		t2.start();
	}
	public void run() {
		for(int i=0;i<5;i++) {
			acc.withdraw(225);
			if (acc.getBal()<0) {
				System.out.println("Amoount is overdrawn...");
			}
		}
	}
}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

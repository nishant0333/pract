package PrintEvenOddThread;

public class PrintEvenOdd {

	int start;
	int max;
	
	
	public PrintEvenOdd(int start ,int max) {
		this.start=start;
		this.max=max;	
	}
	
	public void printEven() {
		
		while(this.start<=this.max) {
			synchronized (this) {
				if (this.start % 2 == 0) {
					System.out.println(Thread.currentThread().getName() +" : " +start);
				start ++;
				
				
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				this.notify();
				
				
				}
				
				else {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		}
		
	}
	
   public void printOdd() {
		
		while(this.start<=this.max) {
			synchronized (this) {
				if (this.start % 2 != 0) {
					System.out.println(Thread.currentThread().getName() +" : " +start);
				start ++;
				
				
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				this.notify();
				
				
				}
				
				else {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		}
		
	}
	
}

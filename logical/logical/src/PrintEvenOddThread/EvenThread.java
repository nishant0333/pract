package PrintEvenOddThread;

public class EvenThread implements Runnable {

	PrintEvenOdd peo;
	
	
	
	public EvenThread(PrintEvenOdd peo) {
		
		this.peo = peo;
	}



	@Override
	public void run() {
		
		peo.printEven();
	}

}

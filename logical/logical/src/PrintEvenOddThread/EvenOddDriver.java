package PrintEvenOddThread;

public class EvenOddDriver {

	public static void main(String[] args) {
		PrintEvenOdd printEvenOdd = new PrintEvenOdd(1, 20);
		
		EvenThread e1=new EvenThread(printEvenOdd);
		
		Thread even=new Thread(e1);
		even.setName("Even Thread");
		
		OddThread o1=new OddThread(printEvenOdd);
		
		Thread odd=new Thread(o1);
		odd.setName("Odd Thread");
		
		even.start();
		odd.start();
		
		

	}

}

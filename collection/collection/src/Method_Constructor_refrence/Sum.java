package Method_Constructor_refrence;

interface I2 {
	public void add(int a, int b);
}

public class Sum {
	public static void sum(int x, int y) {
		System.out.println("sum is : " + (x + y));
	}

	public static void main(String[] args) {
		I2 i = Sum::sum;
		i.add(12, 23);
	}

}

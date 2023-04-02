package java8;

interface I1 {
	public void m1(int a, int b);
}

public class Sum {

	public static void main(String[] args) {
		I1 i = (a, b) -> System.out.println("sum is :" + (a + b));
		i.m1(10, 11);

	}

}

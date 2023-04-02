package java8;

interface Inf {
	public void m1();
}

public class Hello {

	public static void main(String[] args) {
		Inf i = () -> System.out.println("Hello");
		i.m1();
	}

}

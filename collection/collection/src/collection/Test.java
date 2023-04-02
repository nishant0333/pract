package collection;

class A {
	int a = 10;

	public void m1(A a1) {
		System.out.println(a1);

	}

	public class Test {
		public static void main(String[] arg) {
//A a2=new A();
			new A().m1(null);
		}
	}
}
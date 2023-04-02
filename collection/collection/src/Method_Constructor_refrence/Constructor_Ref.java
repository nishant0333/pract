package Method_Constructor_refrence;

interface I3 {
	public Constructor_Ref m1(int x, int y);
}

public class Constructor_Ref {
	Constructor_Ref(int a, int b) {
		System.out.println("subtraction is :" + (a - b));
	}

	public static void main(String[] args) {
		I3 i = Constructor_Ref::new;
		i.m1(30, 10);
	}

}

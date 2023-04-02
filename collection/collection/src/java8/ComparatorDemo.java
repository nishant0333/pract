package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
//		Comparator<Integer> c1 = (I1, I2) -> {
//			if (I1 < I2) {
//				return -1;
//			} else if (I1 > I2) {
//				return 1;
//			} else {
//				return 0;
//			}
//		};
		Comparator<Integer> c1 = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(30);
		l.add(0);
		l.add(15);
		System.out.println(l);
		Collections.sort(l, c1);
		System.out.println(l);
	}

}

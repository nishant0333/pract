package collection;
import java.util.*;
public class hello {

	public static void main(String[] args) {
		Vector v1=new Vector();
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		System.out.println(al);
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("ee");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("***************************\n");
		v1.addAll(al);
		System.out.println(v1);
		v1.add("xyz");
		v1.add(123);
		v1.add("abc");
		v1.addElement(9999);
		System.out.println(v1);
		System.out.println("*******************************\n");
		Enumeration en=v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		ListIterator li=v1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("***********************************\n");
		while(li.hasPrevious()) {
			
		}
	
	}

}

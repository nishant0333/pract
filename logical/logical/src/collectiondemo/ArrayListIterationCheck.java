package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationCheck {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		
		String s=(String)itr.next();
		if(s.equals("A")) {
			itr.remove();
		}
		
		
	}
	System.out.println(al);
	
	for(Object s1:al) {
		
		System.out.println(s1);
	}
	}

}

package collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapDeom {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<>();
		h.put("chini",100);
		h.put("vini",200);
		h.put("guni",300);
		h.put("hini",500);
		System.out.println(h);
		System.out.println("----------Same key different value-------------------");
		System.out.println(h.put("chini",700));
		System.out.println(h);
		System.out.println("-------------keys -------------------");
		
		//taking only key form HashMap
		Set s=h.keySet();
		System.out.println(s);
		
		System.out.println("-----------values---------------------");
		
		//taking only value form HashMap
		Collection c=h.values();
		System.out.println(c);
		System.out.println("----------------entrySet----------------");
		
		//entry set
		Set s1=h.entrySet();
		System.out.println(s1);
		System.out.println("*****************Iterator********************");
		
		//Iterator
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
		Map.Entry s2=(Map.Entry)itr.next();
		//System.out.println(s2.getKey()+"--"+s2.getValue());
		System.out.println(s2);
		//System.out.println("?????"+s2);
		
		if(s2.getKey().equals("hini")) {
			s2.setValue(2000);
			System.out.println("[[[[[[[[[[[[[[[[[[[[[");
			System.out.println(s2);
		}
		}
		System.out.println(h);
		

	}

}

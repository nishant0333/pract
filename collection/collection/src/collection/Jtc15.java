package collection;
import java.util.*;
public class Jtc15 {//example5
public static void main(String arg[]) {
	HashMap hm = new HashMap();
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.isEmpty());
	hm.put("sid",new Integer(99));
	hm.put("sname","som");
	hm.put("email","abc");
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.isEmpty());
	System.out.println(hm.containsKey("sid"));
	System.out.println("sid1");
	System.out.println(hm.containsValue("som"));
	System.out.println(hm.containsValue("som1"));
	System.out.println(hm.get("sname"));
	System.out.println(hm);
	hm.put("sname","rai");
	System.out.println(hm);
	hm.put("sname1","rai");
	System.out.println(hm);
	hm.put(null,"rai");
	hm.put(new Double(999.99),null);
	System.out.println(hm);
	//hm.remove("xx");
	System.out.println(hm);
	Collection col=hm.values();
	System.out.println(col);
	System.out.println("using keySet()");
	Set s=hm.keySet();
	System.out.println(s);
	Iterator it=s.iterator();
	while(it.hasNext()) {
	Object o1=it.next();
	String key="";
	if(o1!=null) {
		key=o1.toString();
	}
	else {
		key=null;
	}
	Object o2=hm.get(key);
	String val="";
	if(o2!=null) {
		val=o2.toString();
		
	}
	else {
		val=null;
	}
	System.out.println(key+"..."+val);
	}
	System.out.println("using entrySet()");
	Set es=hm.entrySet();
	Iterator it1=es.iterator();
	while(it1.hasNext()) {
		Object o=it1.next();
		Map.Entry me=(Map.Entry)o;
		Object o1=me.getKey();
		String key="";
		if(o1!=null) {
			key=o1.toString();
		}
		else {
			key=null;
		}
		Object o2=me.getValue();
		String val="";
		if(o2!=null) {
			val=o2.toString();
		}
		else {
			val=null;
			
		}
		System.out.println(key+"..."+val);
}
}
}

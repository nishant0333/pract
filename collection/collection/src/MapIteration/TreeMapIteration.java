package MapIteration;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIteration {

	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		System.out.println(t);
		Set s1 = t.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry s2 = (Map.Entry) itr.next();
			System.out.println(s2.getKey() + ":" + s2.getValue());
		}
	}

}

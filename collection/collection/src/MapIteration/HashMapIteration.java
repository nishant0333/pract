package MapIteration;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class HashMapIteration implements Comparator<Object> {

	@Override
	public int compare(Object ob1, Object ob2) {
		String s2 = (String) ob1;
		String s3 = (String) ob2;
		return s3.compareTo(s2);
	}

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("haw", 10000);
		h.put("mew", 9000);
		h.put("qew", 8000);
		h.put("ger", 7000);
		h.put("gter", 6000);

		Set s1 = h.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry s2 = (Map.Entry) itr.next();
			System.out.println(s2.getKey() + "---" + s2.getValue());
		}

	}

}

package MapIteration;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableIteration {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		System.out.println(h);
		Set s1 = h.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry s2 = (Map.Entry) itr.next();
			System.out.println(s2.getKey() + ":" + s2.getValue());
		}
	}

}

class Temp {
	int i;

	Temp(int i) {
		this.i = i;
	}

	public int hashcode() {
		return i;
	}

	public String toString() {
		return i + "";
	}
}

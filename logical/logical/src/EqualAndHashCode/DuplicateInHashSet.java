package EqualAndHashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class DuplicateInHashSet {
int id;
int name;


	public DuplicateInHashSet(int id, int name) {
	super();
	this.id = id;
	this.name = name;
}


	@Override
public int hashCode() {
	return 111;
}


@Override
public boolean equals(Object obj) {
	return false;
}


	public static void main(String[] args) {
		DuplicateInHashSet s1 = new DuplicateInHashSet(1,1);
		DuplicateInHashSet s2 = new DuplicateInHashSet(1,1);

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1.equals(s2));

HashMap<DuplicateInHashSet,String> h= new HashMap<>();
h.put(s1, "A");
h.put(s1, "A");


h.entrySet().stream().forEach(System.out::println);

	}

}

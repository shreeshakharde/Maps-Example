package org.test.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap<>();
		
		Person p = new Person("Shreesha");
		System.out.println(p.hashCode());

		Person q = new Person("Shreesha");
		System.out.println(q.hashCode());
		
		map.put(p,"Shreesha in P");
		map.put(q,"Shreesha in Q");
		map.put(null, "efg");
		map.put(null, "abcd");
		map.put(null, "xyz");
		
		System.out.println(map.get(p));
		System.out.println(map.get(q));
		System.out.println(map.get(null));

	}

}

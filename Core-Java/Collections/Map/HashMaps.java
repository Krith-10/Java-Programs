package CollectionGenrics.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("six", 6);
		m.put("one", 1);
		m.put("two", 2);
		m.put("seven", 7);

		System.out.println("Value Associated with key two = "+m.get("two"));
		System.out.println("Keysets: "+m.keySet());
		System.out.println("Entry of map: "+m.entrySet());
		System.out.println("Size of map: "+m.size());

		if(m.containsKey("one")) {
			Integer x=m.get("one");
			System.out.println("one : "+x);
		}

		if(!m.isEmpty()) {
			System.out.println(m);
		}
	}
}

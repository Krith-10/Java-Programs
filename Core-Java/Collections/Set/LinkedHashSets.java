package CollectionGenrics.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {

	public static void main(String[] args) {
		Set<String> list= new LinkedHashSet<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JavaScript");
		Iterator<String> itr=list.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Removed Element: "+list.remove("C"));
		
	}
}

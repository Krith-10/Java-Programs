package CollectionGenrics.List;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector<String> list= new Vector<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JavaScript");
		System.out.println("Element at index 2: "+list.get(2));
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removed Element: "+list.remove(2));
		System.out.println(list.parallelStream());
		System.out.println(list.iterator());
		list.set(2,"Go");
		System.out.println("Postion 2 Element Changed to "+list.get(2));
	}
}

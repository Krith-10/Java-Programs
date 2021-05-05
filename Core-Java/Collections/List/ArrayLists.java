package CollectionGenrics.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(5);
		list.add(14);
		list.add(10);
		list.add(50);
		System.out.println("Element at index 2: "+list.get(2));

		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removed Element: "+list.remove(2));
		System.out.println(list.parallelStream());
		System.out.println(list.iterator());
		list.set(2,15);
		System.out.println("Postion 2 Element"+list.get(2));
	}

}

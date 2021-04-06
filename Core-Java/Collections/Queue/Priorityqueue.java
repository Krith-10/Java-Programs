package CollectionGenrics.Queue;

import java.util.*;

public class Priorityqueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Student> queue= new PriorityQueue<Student>();
		
		Student s1 =  new Student(7,"Aa",8.2f);
		Student s2 = new Student(5,"Bb",8.4f);
		Student s3 = new Student(3,"Cc",8.3f);
		Student s4 = new Student(2,"Dd",8.5f);
		Student s5 = new Student(11,"Ee",8.6f);
		
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		queue.add(s4);
		queue.add(s5);
		
		System.out.println("Head "+queue.element());
		System.out.println("Head "+queue.peek());
		
		//Iterating queue
		
		for(Student s:queue) {
			System.out.println(s);
		}
		
		queue.remove();
		
		Student s6 = new Student(7,"Ff",9.0f);
		queue.offer(s6);
	}
}
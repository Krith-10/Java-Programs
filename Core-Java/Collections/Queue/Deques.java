package CollectionGenrics.Queue;

import java.util.*;  

public class Deques {  
	
	public static void main(String[] args) {  
	
		Deque<String> deque=new ArrayDeque<String>();  
		
		deque.offer("A");  
		deque.add("B");  
		deque.offer("C");
		deque.offerLast("D");
		deque.offerFirst("K");  
		
		for(String s:deque){  
			System.out.println(s);  
		} 	 
		
		deque.pollFirst();
		
		deque.offerLast("Z");
		deque.add("S");
		
		deque.pollLast();  //Here S character is considered as last element and taken away by pollLsat
		
		System.out.println("After few operation performed");
		for(String s:deque){  
			System.out.println(s);  
		}  
	}  
}  
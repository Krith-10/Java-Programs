package CollectionGenrics.List;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] strs = {"JAVA", "Python", "C#","Spring"};
	      System.out.println(Arrays.toString(strs));   
	 
	      List<String> list = Arrays.asList(strs);
	      System.out.println(list);
	      
	      List<Integer> IntList = Arrays.asList(22, 44, 11, 33);
	      System.out.println(IntList);
	}

}

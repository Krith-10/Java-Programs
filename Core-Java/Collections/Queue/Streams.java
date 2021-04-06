package CollectionGenrics.Queue;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		
		Student s1 =  new Student(7,"Aa",8.2f);
		Student s2 = new Student(5,"Bb",8.4f);
		Student s3 = new Student(3,"Cc",8.3f);
		Student s4 = new Student(2,"Dd",8.5f);
		Student s5 = new Student(11,"Ee",8.6f);
		
		studentlist.addAll(Arrays.asList(s1,s2,s3,s4,s5));
		
		//Filtering with gpa
		
		List<Float> gpaList = studentlist.stream()
				.filter(gpa -> gpa.Gpa > 8.39f)
				.map(gpa -> gpa.Gpa)
				.collect(Collectors.toList());
		
		System.out.println("The GPA that are greater than 8.39 :"+gpaList);
		
		//Retrieving their name with gpa greater than 8.39
		
		studentlist.stream()
			.filter(gpa -> gpa.Gpa > 8.39f)
			.forEach(gpa -> System.out.println("Tha names along with gpa greater than 8.39 "+gpa.Name+" ["+gpa.Gpa+"]"));
		
		//To obtain max and min gpa
		
		Student maxGpa = studentlist.stream()
						.max((gpa1,gpa2) -> gpa1.Gpa>gpa2.Gpa?1:-1).get();
	
		Student minGpa  = studentlist.stream()
						.min((gpa1,gpa2) -> gpa1.Gpa<gpa2.Gpa?1:-1).get();
		
		System.out.println("Max GPA :"+maxGpa+" Min GPA :"+minGpa);
		
		
		//Counting the students with roll no greater than 3
		
		int count = (int) studentlist.stream()
						.filter(rno -> rno.Rollno > 3)
						.count();
		System.out.println(count);
		
		//Average of Gpa
		OptionalDouble average = studentlist.stream()
							.mapToDouble((gpa) -> gpa.Gpa)
							.average();
		
		System.out.println("The average Gpa :"+average);
	}
}

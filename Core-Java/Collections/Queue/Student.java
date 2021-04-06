package CollectionGenrics.Queue;


public class Student implements Comparable<Student> {
	int Rollno;
	String Name;
	float Gpa;
	
	public Student(int r, String n, float g) {
		Rollno = r;
		Name = n;
		Gpa = g;
	}
	
	@Override
	public int compareTo(Student s) {
		if(Rollno>s.Rollno)
			return 1;
		else if(Rollno<s.Rollno)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + "]";
	}
	
	
}
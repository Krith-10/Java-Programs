package ExceptionHandling;

public class checkedUncecked {

  //Unchecked Exception
	static void m1() {
		throw new ArithmeticException();
	}
  
	//Checked Exception 
	static void m2() throws ClassNotFoundException {  
		throw new ClassNotFoundException();
	}
	public static void main(String[] args) {
		m1(); //for Unchecked exception
			  
		try {
		  m2(); //for checked exception
		}catch(ClassNotFoundException e) {
			System.out.println("Checked Exception handled.");
		}
	}
}

package LambdaExpression.ArithmeticOps;

import java.util.*;

public class SelectOps {
	public void go(int n) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the first value:");
		int val1 = read.nextInt();
		System.out.println("Enter the second value:");
		int val2 = read.nextInt();
		read.close();
		
		switch(n) {
		
		case 1:
			Operation add = (int a, int b) -> {
				int sum = a+b;
				System.out.println("The addition is "+ sum);
			};
			add.math(val1, val2);
			break;
		
		case 2:
			Operation sub = (int a, int b) -> System.out.println("The subtraction is "+ (a-b));
			sub.math(val1, val2);
			break;
			
		case 3:
			Operation mul = (int a, int b) -> System.out.println("The multiplication is "+ (a*b));
			mul.math(val1, val2);
			break;
			
		case 4:
			Operation div = (int a, int b) -> {
				if(b<=0) System.out.println("Division not possible");
				else {
					System.out.println("The division is "+(a/b));
				}
			};
			div.math(val1, val2);
			break;
		}
	}
	
	public static void main(String[] args) {
		SelectOps value = new SelectOps();
		Scanner scanner = new Scanner(System.in);
		System.out.println("The operations performed are 1.Add 2.Sub 3.Mul 4.Div");
		int select = scanner.nextInt();
		value.go(select);
		scanner.close();
	}
}
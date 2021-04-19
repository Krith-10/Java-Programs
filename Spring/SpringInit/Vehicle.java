package SpringInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car mycar = (Car) context.getBean("car");
		mycar.go();
		System.out.println(context.getMessage("endstatment", null, "Good car", null));
	}
}
package SpringInit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


@SuppressWarnings("deprecation")
public class Drawing {
	
	public static void main(String[] args) {
		//Triangle myTriangle = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle myTriangle = (Triangle)context.getBean("triangle");
		//Coordinate myCoord = (Coordinate)context.getBean("coord1");	//Calling the coord1 bean
		//System.out.println(myCoord.getX1());
		myTriangle.Draw();
		System.out.println(myTriangle.getType());
		System.out.println(myTriangle.getRadius());
	}
}

package com.krith.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	CarPartsProvider car1 = context.getBean("CarParts", CarPartsProvider.class);
    	car1.getBodyplate().setColor("Orange");
    	//System.out.println(car1.getBodyplate().getColor());
    }
}

package com.annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		Animal a1=ctx.getBean("animal",Animal.class);
		System.out.println(a1);
		
		Engine e=a1.getEngine();
		System.out.println(e);
		ctx.close(); //it is mandatory to close for calling destroy method
		             //ConfigurableApplicationContext used for close()
	}
}

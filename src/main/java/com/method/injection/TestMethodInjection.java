package com.method.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjection {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("MethodInjection.xml");
		
		Car car1=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");

		System.out.println(car1);
		System.out.println(car1==car2);
		System.out.println(car1.getEngine()==car2.getEngine());
	}
}

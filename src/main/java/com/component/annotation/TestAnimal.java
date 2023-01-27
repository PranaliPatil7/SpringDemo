package com.component.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("componentConfig.xml");
		Animal a1=(Animal) ctx.getBean("animal");
		System.out.println(a1);
	}
}

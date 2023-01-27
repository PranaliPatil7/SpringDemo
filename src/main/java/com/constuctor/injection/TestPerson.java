package com.constuctor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ConstructorInjection.xml");
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
		
	}
}

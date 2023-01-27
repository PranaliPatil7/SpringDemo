package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("CollectionContext.xml");
		
		Employee e1=(Employee) ctx.getBean("emp");
		
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddress());
		System.out.println(e1.getCources());
		System.out.println(e1.getInfo());
	}
}

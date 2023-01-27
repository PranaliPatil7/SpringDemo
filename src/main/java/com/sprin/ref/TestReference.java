package com.sprin.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("refConfigurationContext.xml");
		
		Faculty f=(Faculty) ctx.getBean("facref");
		System.out.println(f.getId());
		
		System.out.println(f.getSub().getSubno());
		
		System.out.println(f);
	}
}

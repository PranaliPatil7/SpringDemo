package com.autowiring.candidate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireCandidate {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AutowiringCandidate.xml");
		
		Empolyee e=(Empolyee) ctx.getBean("emp");
		System.out.println(e);
	}
}

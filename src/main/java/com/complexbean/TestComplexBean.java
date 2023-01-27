package com.complexbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.candidate.Empolyee;

public class TestComplexBean {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ComplexBean.xml");
		
		Person p1=(Person) ctx.getBean("person");
		Person p2=(Person) ctx.getBean("person");
	
		System.out.println(p1==p2);
		System.out.println(p1.dept==p2.dept);
		System.out.println(p1);
		
}
}

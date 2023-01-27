package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("TestConfigurationContext.xml");
		
		Student s1=(Student) ctx.getBean("stud");
		
		Student s2=(Student) ctx.getBean("stud1");
		
		System.out.println(s1);
		
		System.out.println(s2);
	}
}

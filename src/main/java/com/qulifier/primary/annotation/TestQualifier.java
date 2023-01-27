package com.qulifier.primary.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestQualifier {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		
		ctx.register(StudentConfig.class);
		
		ctx.refresh();
		
		Student s1= ctx.getBean(Student.class);
		s1.getSub().printSubjectInfo();
		System.out.println(s1);
	}
}
 
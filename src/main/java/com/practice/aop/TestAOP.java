package com.practice.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(TestAopConfig.class);
		ctx.refresh();
		
		EmployeeMananger emp =ctx.getBean(EmployeeMananger.class);
		
		emp.getEmployeeById(101);
		
	}
}
     
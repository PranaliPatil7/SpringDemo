package com.propertysource.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(DbConfig.class);
		ctx.refresh();
		DbProps prop=ctx.getBean(DbProps.class);
		System.out.println(prop);
	}
}

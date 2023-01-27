package com.constuctor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdditionAmbiguity {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AmbiguityContext.xml");
        AdditionAmbiguity a=(AdditionAmbiguity) ctx.getBean("add");
        a.doSum();
	}
}

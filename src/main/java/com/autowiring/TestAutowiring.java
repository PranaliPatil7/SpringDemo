package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("autowiringConfig.xml");
			
			Employee e=(Employee) ctx.getBean("emp");
			System.out.println(e);
		}
}

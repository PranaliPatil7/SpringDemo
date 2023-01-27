package com.componentscan.exclude.filter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import com.exclude.filter.D;

@Configuration
@ComponentScan(basePackages="com.exclude.filter",
//excludeFilters=@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes= {D.class}))
excludeFilters=@ComponentScan.Filter(type=FilterType.ASPECTJ,pattern ="com.exclude.*" ))
public class TestConfig {

	public static void main(String[] args) {
		
		System.out.println("inside main config");
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(TestConfig.class);
		ctx.refresh();
		
	}
}
 
package com.qulifier.primary.annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration 
@ComponentScan(basePackages="com.qulifier.primary.annotation")
public class StudentConfig {
	@Bean(name="CurrentAddress")
	public Address getAddress1()       //Factory method
	{
		return new Address(123,"pune");
	}
	
	@Bean(name="permanentAddress")
	@Primary                      //apply on method(factory)where two methods are present and we want only one that time
	public Address getAddress2()       //Factory method
	{
		return new Address(456,"Sangli");
	}
	
}

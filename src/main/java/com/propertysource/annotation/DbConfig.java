package com.propertysource.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
@Configuration
@ComponentScan(basePackages="com.propertysource.annotation")
@PropertySource("classpath:my.properties")
public class DbConfig {
	@Autowired
	Environment env ;     //imp for propertySource used to access property
	@Bean
	public DbProps getProps()
	{
		DbProps prop=new DbProps();
		prop.setUrl(env.getProperty("db.url"));
		prop.setUser(env.getProperty("db.user"));
		prop.setPwd(env.getProperty("db.password"));

		return prop;  
	}
}

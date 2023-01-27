package com.qulifier.primary.annotation;

import org.springframework.stereotype.Component;

@Component
public class English implements Subject {

	public void printSubjectInfo() {
		System.out.println("this is English");		
	}

}

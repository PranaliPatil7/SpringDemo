package com.qulifier.primary.annotation;

import org.springframework.stereotype.Component;

@Component
public class Maths implements Subject {

	public void printSubjectInfo() {
		System.out.println("this is maths");
	}

}

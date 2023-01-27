package com.practice.aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeMananger {
	public Employee getEmployeeById(Integer employeeId)
	{
		System.out.println("Method getEmlployeeId called");
//		if(true)
//		throw new NullPointerException(); not need but it only for checking AfterThrowing type 
		
		return new Employee(100,"Ram");
		
	}
}

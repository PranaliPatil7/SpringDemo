package com.practice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //for make a class aspect
@Component
public class EmployeeManangerAspect {
//	
//	@Before("execution(* EmployeeMananger.getEmployeeById(..))")
//	public void m1()
//	{
//		System.out.println("logging information...Before");   //it will run before executing getEmployeeById()
//	}
//	
//	@After("execution(* EmployeeMananger.getEmployeeById(..))")
//	public void m2()
//	{
//		System.out.println("logging information...After");   //method execute successfully either throwing Exception
//	}
//	
//	@AfterReturning("execution(* EmployeeMananger.getEmployeeById(..))")
//	public void m3()
//	{
//		System.out.println("logging information...AfterReturning");   //it will run After executing getEmployeeById() then and then only
//	}
//	
//	@AfterThrowing("execution(* EmployeeMananger.getEmployeeById(..))")
//	public void m4()
//	{
//		System.out.println("logging information...AfterThrowing");   //it will run only method throwing exception 
//	}
//	
	@Around("execution(* EmployeeMananger.getEmployeeById(..))")
	public void m5(ProceedingJoinPoint pjp) throws Throwable  
	{                                                         //when we want before and after then we have to trigger ProceedingJoinPoint object in method Parameters
		System.out.println("logging information...Around before"); //when we do not provide ProceedingJoinPoint object around stop after logging  
		pjp.proceed();
		int i=(Integer) pjp.getArgs()[0];  //for getting parameters of Employee class method getEmployeeById 
		System.out.println(">>>>>>>>>"+i);  
		System.out.println("logging information...Around After");   
	}
}

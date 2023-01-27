package com.constuctor.injection;

public class AdditionAmbiguity {
	private int a;
	private int b;
	
	public AdditionAmbiguity(double a, double b) {
		super();
		this.a = (int) a;                   //when we dont have String constructor in constructor type
		this.b = (int) b;                   //injection then first constructor will be call
		System.out.println("Constructor:double,double");
	}
	
	public AdditionAmbiguity(int a, int b) {   
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor:int,int");
	}
	
//	public AdditionAmbiguity(String a,String b)
//	{
//		super();
//		this.a=Integer.parseInt(a);       //when we have String constructor then first preference for 
//		this.b=Integer.parseInt(b);       //this String constructor in Constructor type injection
//		System.out.println("Constructor:String,String"); 
//
//	}
	public void doSum()
	{
		System.out.println("value of a:"+this.a);     
		System.out.println("value of b:"+this.b);

		System.out.println("sum is = "+(this.a+this.b));
	}
	
	
}

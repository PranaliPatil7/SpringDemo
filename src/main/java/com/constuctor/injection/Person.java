package com.constuctor.injection;

public class Person {
	private String name;
	private int id;
	//private Certi certi;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
//	public Person(String name, int id,Certi certi) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.certi=certi;
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", id=" + id + ",certi="+certi+"]";
//	}
	
}

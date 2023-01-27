package com.qulifier.primary.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int roll;
	String name;	
	@Autowired
	@Qualifier("maths") //qualifier apply for field where two types of that field
	Subject sub;
	@Autowired
	Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, Subject sub, Address addr) {
		super();
		this.roll = roll;
		this.name = name;
		this.sub = sub;
		this.addr = addr;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", sub=" + sub + ", addr=" + addr + "]";
	}
	
}

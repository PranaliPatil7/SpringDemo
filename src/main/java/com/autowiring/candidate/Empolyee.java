package com.autowiring.candidate;

public class Empolyee {
	private Address address;
	private Department dept;
	public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empolyee(Address address, Department dept) {
		super();
		this.address = address;
		this.dept = dept;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Empolyee [address=" + address + ", dept=" + dept + "]";
	}
	
	
}

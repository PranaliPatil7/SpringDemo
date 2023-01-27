package com.autowiring;

public class Employee {
	private Address address;  //this address field will compulsory matching with bean name in config file

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("by constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("by setter method");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}

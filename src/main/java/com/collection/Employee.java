package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> Cources;
	Properties Info;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> cources,
			Properties info) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		Cources = cources;
		Info = info;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCources() {
		return Cources;
	}
	public void setCources(Map<String, String> cources) {
		Cources = cources;
	}
	
	public Properties getInfo() {
		return Info;
	}

	public void setInfo(Properties info) {
		Info = info;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", Cources=" + Cources
				+ ", Info=" + Info + "]";
	}

	
	
	
}

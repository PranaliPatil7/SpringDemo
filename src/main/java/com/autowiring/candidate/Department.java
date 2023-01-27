package com.autowiring.candidate;

public class Department {
	private int id;
	private String sub;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String sub) {
		super();
		this.id = id;
		this.sub = sub;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", sub=" + sub + "]";
	}
	
	
}

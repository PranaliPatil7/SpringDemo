package com.sprin.ref;

public class Faculty {
	private int id;
	private Subject sub;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", sub=" + sub + "]";
	}
	
	
}

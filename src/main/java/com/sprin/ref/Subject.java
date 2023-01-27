package com.sprin.ref;

public class Subject {
	private int subno;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubno() {
		return subno;
	}

	public void setSubno(int subno) {
		this.subno = subno;
	}

	@Override
	public String toString() {
		return "Subject [subno=" + subno + "]";
	}
	
}

package com.annotations;

public class Engine {
	int capacity;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + "]";
	}
	
	
}

package com.annotations;

import org.springframework.beans.factory.annotation.Value;

public class AnimalCategory {
	@Value("dog")
	String category;

	public AnimalCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalCategory(String category) {
		super();
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "AnimalCategory [category=" + category + "]";
	}
	
}

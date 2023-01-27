package com.component.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	@Value("10")
	int id;
	AnimalCategory animalCategory;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int id, AnimalCategory animalCategory) {
		super();
		this.id = id;
		this.animalCategory = animalCategory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AnimalCategory getAnimalCategory() {
		return animalCategory;
	}
	@Autowired
	public void setAnimalCategory(AnimalCategory animalCategory) {
		System.out.println("setter invoked for animalCategory");
		this.animalCategory = animalCategory;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", animalCategory=" + animalCategory + "]";
	}
	
}

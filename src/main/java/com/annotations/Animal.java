package com.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Animal {    
	@Value("10")
	int id;
	
	@Autowired
	AnimalCategory animalcategory;
	
	public Animal() {
		super();
		System.out.println("no arg constructor for Animal");
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Animal(AnimalCategory animalcategory) {
		super();
		System.out.println("Constructor for AnimalCategory invoked!!!");
		this.animalcategory = animalcategory;
	}


	public Animal(int id, AnimalCategory animalcategory) {
		super();
		this.id = id;
		this.animalcategory = animalcategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnimalCategory getAnimalcategory() {
		return animalcategory;
	}
	@Autowired 
	public void setAnimalCategory(AnimalCategory animalcategory) {
		System.out.println("Setter for AnimalCategory invoked!!!");
		this.animalcategory = animalcategory;
	}

	//@Override
	public String toString() {
		return "Animal [id=" + id + ", animalcategory=" + animalcategory + "]";
	}
	@PostConstruct
	public void init()
	{
		System.out.println("init method invoked..");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method invoked..");
	}
	
	@Bean
	public Engine getEngine() //Factory Method
	{
		 Engine e =new Engine();
		 e.setCapacity(200);
		 return e; 
	}
	
	
}

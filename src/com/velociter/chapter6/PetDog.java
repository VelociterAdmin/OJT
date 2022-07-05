package com.velociter.chapter6;

public class PetDog extends Animal implements Cloneable {
	//Constructor
	public PetDog(String aName,String aBreed) {
		super("Dog");
		petFlea = new Flea("Max","circus Flea");
		this.name = aName;
		this.breed = aBreed;
	}
	
	//Rename the dog
	public void setName(String name) {
		this.name = name;
	}
	
	//Return the dog's name
	public String getName() {
		return name;
	}
	
	//Return the dos's breed
	public String getBreed() {
		return breed;
	}
	
	//Return the Dog's Flea
	public Flea getFlea() {
		return petFlea;
	}
	
	//Sound
	public void sound() {
		System.out.println("Woof");
	}
	
	//Return the String for the pet dog
	public String toString() {
		return super.toString()+"\nIt's "+name+" the "+breed;
	}
	
	///Override inherited clone() to make it public
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	private Flea petFlea;
	private String name,breed;
	
}

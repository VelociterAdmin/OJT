package com.velociter.extendingclasses;

public class Flea extends Animal implements Cloneable{
	//Create constructor 
	public Flea(String aName, String aSpecies) {
		super("Flea");
		name = aName;
		species = aSpecies;
	}
	
	//Change the Flea name
	public void setName(String aName) {
		name = aName;											//Change to new name
	}
	
	//return the flea's name
	public String getName() {
		return name;
	}
	
	//return the species
	public String getSpecies() {
		return species;
	}
	
	//sount
	public void sound() {
		System.out.println("Psst");
	}
	
	//Present a flea detail in string
	public String toString() {
		return super.toString()+ "\nIt's "+name+" the "+species;
	}
	
	//override inherited clone() to make it public
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	private String name,species;
	
}

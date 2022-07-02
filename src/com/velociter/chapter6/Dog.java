package com.velociter.chapter6;

public class Dog extends Animal{
	
	public void sound() {
		System.out.println("Woof\tWoof");
	}
	
	public Dog(String aName) {
		super("Dog");
		name = aName;
		breed = "Unknown";
	}
	
	public Dog(String aName, String aBreed) {
		super("Dog");
		name = aName;
		breed = aBreed;
	}
	
	public String toString() {
		return super.toString()+"\nIts "+name+" the "+breed;
	}
	
	private String name,breed;
}

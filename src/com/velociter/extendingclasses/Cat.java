package com.velociter.extendingclasses;

public class Cat extends Animal {
	public void sound() {
		System.out.println("Miiaooww");
	}
	public Cat(String aName) {
		super("Cat");
		name= aName;
		breed = "Unknown";
	}
	
	public Cat(String aName, String aBreed) {
		super("Cat");
		name = aName;
		breed = aBreed;
	}
	
	public String toString() {
			return super.toString() + "\nIt's "+name+" the "+breed;
	}
	
	private String name,breed;

}
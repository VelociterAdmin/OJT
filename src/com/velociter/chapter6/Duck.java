package com.velociter.chapter6;

public class Duck extends Animal {
	public Duck(String aName) {
		super("Duck");
		name = aName;
		breed = "Unknown";
	}
	
	public Duck(String aName, String aBreed) {
		super("Duck");
		name = aName;
		breed = aBreed;
	}
	
	public String toString() {
		return super.toString()+" \nIt's "+name+" the "+breed;
	}
	
	public void sound() {
		System.out.println("Quack quackquack");
	}
	private String name,breed;
}

package com.velociter.chapter6example;

public class Duck extends Animal {
	private String name; 
	private String breed;
public Duck(String aName) {
super("Duck");
name= aName; 
breed ="Unknown";
}
public Duck(String aName, String aBreed) {
super( "Duck");
name = aName; 
breed = aBreed; 
}

public String toString() {
return super.toString()+ "\nIt's " + name + " the " + breed;
		}

public void sound() {
System.out.println("Quack quackquack");
	
 }
}

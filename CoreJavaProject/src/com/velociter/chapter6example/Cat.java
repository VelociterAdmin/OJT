package com.velociter.chapter6example;

	public class Cat extends Animal {
		private String name; 
		private String breed;
		
		public Cat(String aName) {
		super("Cat"); 
		name = aName; 
		breed = "Unknown"; 
		}
		public Cat(String aName, String aBreed) {
		super("Cat"); 
		name = aName; 
		breed = aBreed; 
		}
	
		public String toString() {
		return super.toString() + "\nIt's " + name + " the " + breed;
		}
		
		public void sound() {
		System.out.println("Miiaooww");
		}
		
}

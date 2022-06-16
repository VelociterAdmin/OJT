package com.velociter.chapter6example;

	import java.util.Random;
	public class TryPolymorphism {
	public static void main(String[] args) {
	
	Animal[] theAnimals = {new Cat("Max", "Abyssinian"),new Duck("Daffy","Aylesbury")};
	Animal petChoice;
	Random select = new Random(); 
	
	for(int i = 0; i < 5; i++) {
	
	petChoice = theAnimals[select.nextInt(theAnimals.length)];
	System.out.println("\nYour choice:\n" + petChoice);
	petChoice.sound(); 
	}
  }
}


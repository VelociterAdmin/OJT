package com.velociter.chapter6;
import java.util.Random;
public class TryPolymorphism {

	public static void main(String[] args) {
		Animal[] theAnimals = {new Dog("Rover","Poodle")};//,new Cat("Max","Abyssinian"),new Duck("Daffy","Aylesbury")};
		Animal petChoice;
		Random random=new Random();
		for(int i=0;i<5;i++)
		{
			petChoice=theAnimals[(random.nextInt(theAnimals.length))];		}
		System.out.println("\nyour choice"+"pet");
		//petChoice.sound(); 
	}

}

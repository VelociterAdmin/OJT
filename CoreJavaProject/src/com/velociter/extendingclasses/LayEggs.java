package com.velociter.extendingclasses;

public class LayEggs {
	public static void main(String[] args) {
		Duck aDuck = new Duck("Donald","Eider");
		Animal aPet =  aDuck;						//Cast the Duck to Animal
//		aPet.layEgg();								//This wont compile
		((Duck)aPet).layEgg(); 						// This works fine
		((Duck)aPet).sound();
	}
}
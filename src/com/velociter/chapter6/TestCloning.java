package com.velociter.chapter6;

public class TestCloning {
	public static void main(String[] args) {
		try {	
			PetDog myPet = new PetDog("Fang","Chihuahua");
			PetDog yourPet = (PetDog)myPet.clone();
			yourPet.setName("Gnasher");
			yourPet.getFlea().setName("Atlas");
			System.out.println("\nYour Pet Details: \n"+yourPet);
			System.out.println("\nMy Pet Details: \n"+myPet);
			 
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace(System.err);
		}
	}
}

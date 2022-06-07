package com.velociter.chapter5;

public class MagicHat_Test {

	public static void main(String[] args) {
		
	    MagicHat hat = new MagicHat("hat"); 
	   

		MagicHat.Rabbit rabbit =new MagicHat.Rabbit(); 
		System.out.println(hat); 		
		System.out.println("\nNew rabbit is :"+ rabbit);
}
}
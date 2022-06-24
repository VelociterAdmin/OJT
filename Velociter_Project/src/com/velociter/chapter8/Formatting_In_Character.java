package com.velociter.chapter8;
 // 3rd Example of Chapter 8
public class Formatting_In_Character {
	
  public static void main(String[] args) {
	  
		 System.out.println("\n Formatting in characters:");
			int count =0;      //initialize count is 0 
			for(int ch = 'a' ; ch<= 'z' ; ch++) { //used for loop
			System.out.printf(" %1$4c%1$4x", ch); //print char values
			if(++count%6 == 0) {        //given condition if 6 equal to 0
			System.out.printf("\n");     // then break the line.
			}
		}

	}

}

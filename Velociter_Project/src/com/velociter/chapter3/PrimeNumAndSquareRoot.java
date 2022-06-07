package com.velociter.chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumAndSquareRoot {

	public static void main(String[] args) {
		int num,squarroot;
		boolean flag=true;
		try {
		Scanner scan=new Scanner(System.in);
		 		
		System.out.println("Enter any number:");
		num=scan.nextInt();
		squarroot=(int)(Math.sqrt(num));
		
		for(int i=2;i<=squarroot;i++)
		{
			if((num%i)==0) {
				flag=false;
				break;
			}
				
		}
		if(flag==false) {
			System.out.println(" not prime number");
		}
		else {
			System.out.println(" prime number");
		}
	   
	  }
		catch(InputMismatchException e) {
			System.out.println("Please enter valid input");
		}
			}
}
		
		
		
		
		
		

	


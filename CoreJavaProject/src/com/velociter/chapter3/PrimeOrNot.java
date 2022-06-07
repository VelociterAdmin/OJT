package com.velociter.chapter3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		int number, sq;
		boolean flag=true;
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=s.nextInt();
		sq=(int)(Math.sqrt(number));
		System.out.println(sq);
		for(int i=2;i<=sq;i++) 
		{
			//System.out.println(i);
			if((number%i)==0){
				flag=false;
				break;
			}
			
			}
			if (flag==false) {
				System.out.println("This is a not prime number");
			}
			else {
				System.out.println("This is  a prime number");
			
			}
			
			
		}
	
	catch(InputMismatchException e) {
		System.err.println("please enter valid integer number");
	}
	
		
	}
	}



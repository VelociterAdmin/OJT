package com.simple.javaproject;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number , i=0;
		while(i<15){
			number = 1+ (int) (500*Math.random());
			if(number%2==0) {
				if(number<250){
					System.out.println("The Number is less then TwoFifty      " + number);
				}
				else
				{
					System.out.println("The Number is greater then TwoFifty   " + number);
				}
			}
			else
			{
				System.out.println("The Number is Odd                     " + number);
			}
			i++;
		}
	}

}

package com.simple.javaproject;
/*
 *	Write a console program to declare and initialize a double variable with some value such as
 *	1234.5678. Then retrieve the integral part of the value and store it in a variable of type long, and
 *	the first four digits of the fractional part and store them in an integer of type short. Display the
 *	value of the double variable by outputting the two values stored as integers
 */
public class DoubleToLongAndShort {

	public static void main(String[] args) {
		double number = 12345.56789;											//Declare a variable
		long integerPart = (long) number;									//Retrieve Integer part of that variable
		double fractionPart = (double) (number-integerPart);
		double digitOfNumber = fractionPart,count=0;
		System.out.println(digitOfNumber);
		while(digitOfNumber!=0)
		{
			System.out.println("Loop "+digitOfNumber);
			digitOfNumber /=10;
			count++;
		}
		System.out.println("count ="+count);
		int fractionalPart = (int) (Math.pow(10,4)*(fractionPart)); //Retrieve fractional part
		System.out.println("DoubleVariable Value : "+number); 
		System.out.println("IntegerPart : "+integerPart);
		System.out.println("Fractional Part : "+fractionalPart);
		
	}
}

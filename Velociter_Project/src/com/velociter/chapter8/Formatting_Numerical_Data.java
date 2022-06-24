package com.velociter.chapter8;

//2nd Example of Chapter 8;
public class Formatting_Numerical_Data {
	public static void main(String[] args) {
 System.out.println("Formatting in numerical");
 
	int a = 5; 
    int b = 15;
    int c = 255;
	double x = 27.5, y = 33;
	//%f is used for floating value, %g used for scientific notation.
	//%d used for integer value,%c used for character value
	//%b is used for boolean value
	System.out.printf("x = %f y = %g", x, y); //print x and y value
	System.out.println();
	System.out.printf("a = %d  b = %x  c = %b", a, b, c); //print a,b and values
	
   
}
}

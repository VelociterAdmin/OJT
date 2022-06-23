package com.velociter.chapter8;


public class Formatting_Numerical_Data {
	public static void main(String[] args) {
 System.out.println("Formatting in numerical");
	int a = 5; 
    int b = 15;
    int c = 255;
	double x = 27.5, y = 33.75;
	System.out.printf("x = %f y = %g", x, y);
	System.out.println();
	System.out.printf(" a = %d b = %x c = %b", a, b, c);
	
    System.out.println("\n Formatting in characters:");
	int count =0;
	for(int ch = 'A' ; ch<= 'Z' ; ch++) {
	System.out.printf(" %1$4c%1$4x", ch);
	if(++count%6 == 0) {
	System.out.printf("\n");
	}
}
}
}

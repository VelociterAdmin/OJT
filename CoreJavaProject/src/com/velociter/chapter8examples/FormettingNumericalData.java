package com.velociter.chapter8examples;

public class FormettingNumericalData {
// chapter 8 example
	public static void main(String[] args) {
		int a=5,b=15,c=255;                            //declared 3 integer variables
		double x=27.5,y=33.75;                         //declared 3 double variables
		System.out.printf("x = %f y = %g", x, y);            //%f is used for float and %g is used to scientific notation
		System.out.printf(" a = %d  b= %d c = %d ", a, b, c);    //%d is used for integer
		System.out.println(" ");
		System.out.printf("x = %f y = %g", x, y);           
		System.out.printf(" a = %d b = %x c = %o", a, b, c);  //%x is used for hexadecimal values and %o is used for octal values
	}

}

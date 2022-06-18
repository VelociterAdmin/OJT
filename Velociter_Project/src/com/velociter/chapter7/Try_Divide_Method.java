package com.velociter.chapter7;

public class Try_Divide_Method {
	public static int divide(int[]array,int index) {
		try {
			System.out.println("First try block in divide()entered:");
			array[index+2]=array[index]/array[index + 1];
			return array[index + 2];
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception caught in divide():");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}
		finally {
			System.out.println("finally block in divide()");
			}
		return array[index+2];
	}
public static void main(String[] args) {
	int[]x= {10,5,0};
	try {
		System.out.println("First try block in main() entered");
		System.out.println("result =" + divide(x,0)); 
		x[1] = 0; 
		System.out.println("result =" + divide(x,0)); 
		x[1] = 1; 
		System.out.println("result =" + divide(x,1));
	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic exception caught in main():");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException caught in main():");
	}
}
}

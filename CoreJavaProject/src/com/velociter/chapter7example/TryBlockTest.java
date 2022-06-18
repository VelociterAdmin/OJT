package com.velociter.chapter7example;

import java.io.IOException;

public class TryBlockTest {
		
		public static int divide(int[] array, int index) {
			try {
				System.out.println("\nFirst try block in divide() entered");
				array[index + 2] = array[index]/array[index + 1];
				System.out.println("Code at end of first try block in divide()");
			
						return array[index + 2];
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic exception caught in divide()");
			} 
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index-out-of-bounds exception caught in divide()");
				} 
			finally {
				System.out.println("finally block in divide()");
				}
				System.out.println("Executing code after try block in divide()");
				return array[index + 2];
				}
		public static void main(String[] args) {
			int[] x = {10, 5, 0}; 
			try {
			System.out.println("First try block in main() entered");
			System.out.println("result = " + divide(x,0)); 
			x[1] = 0; 
			System.out.println("result = " + divide(x,0));
			x[1] = 1;
			System.out.println("result = " + divide(x,1));
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic exception caught in main()");
				} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index-out-of-bounds exception caught in main()");
				}
				System.out.println("Outside first try block in main()");
				System.out.println("\nPress Enter to exit");
				
			/*	try {
				System.out.println("In second try block in main()");
				System.in.read(); 
				return;
				} catch(IOException e) {
				System.out.println("I/O exception caught in main()");
				} finally { 
				System.out.println("finally block for second try block in main()");
				}
				System.out.println("Code after second try block in main()"); */ 
	}
}
				

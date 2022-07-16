package com.velociter.chapter7;

import java.io.IOException;

//	Execution Sequence of a try Block

public class TryBlockTest {
	
	public static int divide(int[] array, int index) {
		try {
			System.out.println("\nFirst Try block ");
			array[index+2] = array[index]/array[index+1];
			System.out.println("Code at end of first try block in divide()");
			return array[index+2];
		}
		catch(ArithmeticException e) {
			System.out.println("Arthmetic Exception cought in divide()");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index-Out-Of-Bounds Exception cought in devide()");
		}
		finally {
			System.out.println("finally block in divide()");
		}
		
		System.out.println("Executing code after try block in divide()");
		return array[index+2];	
	}
	
	public static void main(String[] args) {
		int[] x = {10,5,0};
		try {
			System.out.println("First try block in main() entered");
			System.out.println("result : "+divide(x, 0));
			x[1] = 0;
			System.out.println("result : "+divide(x, 0));
			x[1] = 1;
			System.out.println("result : "+divide(x, 1));
			
		}catch(ArithmeticException e) {
			System.out.println("Arthmetic Exception cought in main()");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index-Out-Of-bounds Exception cought in main()");
		}
		System.out.println("Outside first try block in main()");
		System.out.println("Press Enter to exit");
		
		try {
			System.out.println("In second try block of main()");
			System.in.read();
			return;
		}catch(IOException e) {
			System.out.println("I/O Exception cought in main()");
		}finally {
			System.out.println("finally block for secong try block in main()");
		}
	}
}
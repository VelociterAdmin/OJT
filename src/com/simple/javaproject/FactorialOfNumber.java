package com.simple.javaproject;

public class FactorialOfNumber {

	public static void main(String[] args) {
		long limit = 20L;
		long factorial;
		for(long i = 1L;i<=limit;i++) {
			factorial = 1L;
			for(long factor = 2;factor<=i;factor++) {
				System.out.println("Factor Loop "+factor);
				factorial *=factor;
			}
			System.out.println(i+"! is " +factorial);
		}
		
	}

}

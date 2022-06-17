package com.velociter.chapter7example;

public class TestLoopTryCatch {
	public static void main(String[] args) {
	int i = 12;
	for(int j=3 ;j>=-1 ; j--) 
	try {
	System.out.println("Try block entered " + "i = "+ i + " j = "+j);
	System.out.println(i/j); 
	//System.out.println("Ending try block");
	}
	catch(ArithmeticException e) { 
	System.out.println("ArithmeticException");
   }
  }
}

package com.velociter.chapter7;

public class ArithmeticExceptionUsingLoop {

	public static void main(String[] args) {
		try {
			  divide();
		  }
		  catch(ArithmeticException e) {
			 System.out.println(e); 
		  }
	}
       
public static void divide() {
	  int itration;
	  int divisor;
	  int result;
	 try {
	  for( itration =0;; itration++) {
		divisor=(int) (5*Math.random());
		result=10/divisor;
		System.out.println(result);
	  }
	 }
	  catch(ArithmeticException ex) {
		 System.out.println(ex); 
	  }
       
}

	}


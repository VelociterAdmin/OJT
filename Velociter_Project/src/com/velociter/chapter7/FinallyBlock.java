package com.velociter.chapter7;

public class FinallyBlock {

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
	  for( itration =0; ; itration++) {
		 divisor=(int)(10*Math.random());
		result=100/divisor;
		System.out.println(result);
	  }
	 }
	  catch(ArithmeticException ae) {
		 System.out.println("ArithmeticException"); 
	  }
	 finally {
		 System.out.println("Finally execution completed:");
	 }
       
}

	}



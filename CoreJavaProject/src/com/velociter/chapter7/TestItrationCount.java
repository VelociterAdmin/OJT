package com.velociter.chapter7;
public  class TestItrationCount {
	public static void main(String[] args) {
		try{
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
			for(itration=0;; itration++) {
				divisor=(int)(5*Math.random());
			    result=10/divisor;
			    System.out.println(result);
			  
		 }
	}
	
		catch(ArithmeticException e2) {
			System.out.println(e2);
			
	}
  }
}		

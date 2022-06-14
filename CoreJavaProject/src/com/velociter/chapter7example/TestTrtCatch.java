package com.velociter.chapter7example;

public class TestTrtCatch {

	public static void main(String[] args) {
		int i=1;
		int j=0;
		try {
			System.out.println("divide i by j");
			System.out.println("i="+i+"\nj="+j);
			System.out.println(j=i/j);
			System.out.println(j);
	}
		 catch(ArithmeticException e){
			System.out.println("It is an ArithmeticException");
	
		}
		i=24;
		j=24;
		System.out.println(j=i+j);
	}
}
package com.velociter.chapter6.exercise;

public class TestLoopTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12;
		for(int j=3; j>=-1; j--) 
			try {
				System.out.println("Try Block entered i: "+i+", j: "+j);
				System.out.println(i/j);
				System.out.println("Ending of try block");
			}catch (ArithmeticException e) {
				System.out.println("Arthmatic Exception cought ");
//				System.exit(0);
			}
			System.out.println("After Try Block");
			return;
		
	}

}

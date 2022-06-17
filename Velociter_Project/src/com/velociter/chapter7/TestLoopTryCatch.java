package com.velociter.chapter7;

public class TestLoopTryCatch {
	public static void main(String[] args) {
		int i=12;
		for(int j=3;j>=-1;j--) 
		try {
			System.out.println("Try blocked entered:");
			System.out.println("Loop entered:"+ "i="+ i +"j="+ j);
			System.out.println(i/j);
				
			}
		
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException caught ");
				
			}
		}
	}



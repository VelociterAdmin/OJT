package com.velociter.chapter7;

public class TestLoopTryCatch {
	public static void main(String[] args) {
		int i=12;
		
		try {
			System.out.println("Try blocked entered:");
			for(int j=3;j>=-1;j--) {
			System.out.println("Loop entered:"+ "i="+ i +"j="+ j);
			System.out.println(i/j);
				
			}
		}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException caught ");
				
			}
		}
	}



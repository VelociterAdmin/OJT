package com.velociter.chapter7;

public class TryCatchBlock {
	public static void main(String[] args) {
		int i=1;
		int j=0;
		try {
			System.out.println("i divided by j");
			System.out.println("i="+ i +"\nj="+ j );
			System.out.println(j=i/j);
			System.out.println(j);
			}
		catch(ArithmeticException e) { 
			System.out.println("It is an ArithmeticException");
			}
	}

}

package com.simple.javaproject;

public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i=0;
		while(i<10)
		{
			number = 1+(int) (100*Math.random());
		if(number%2 == 0)
			System.out.println("The Number is Even "+number);
		else
			System.out.println("The Number is Odd "+number);
		i++;
		}
	}

}

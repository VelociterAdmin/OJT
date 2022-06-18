package com.simple.javaproject;

public class TheConditionalOperator {

	public static void main(String[] args) {
		int nHat=1;
		System.out.println("I have "+nHat+" hat" +(nHat==1?".":"s."));
		nHat++;
		System.out.println("I have "+nHat+" hat" +(nHat==1?".":"s."));
		
	}

}

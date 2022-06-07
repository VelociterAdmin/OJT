package com.velociter.chapter2;

public class RelationalOperators {

	public static void main(String[] args) {
		int num1=25,num2= 30,num3=35,num4=40;
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num3<num4);
		System.out.println(num4>num3);
		System.out.println(num2<=num3);
		System.out.println(num1>=num2);
		System.out.println("===============");
		
		System.out.println((num1<num2)&&(num2<num3));
		System.out.println((num3<num2)||(num1<num2));
				
	}

}

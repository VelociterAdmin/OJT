package com.simple.javaproject;

public class Exampless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arg1 = 9.0f, arg2 = 5.0f;
		double arg3 = arg1 % arg2;
		double arg4 = Math.IEEEremainder(arg1, arg2);
		System.out.println("The Reminder is : "+arg3);
		System.out.println("The Reminder with Maths class is : "+arg4);
		double arg5 = Math.sqrt(25);
		System.out.println("The sqrt() : "+arg5);
		double result,Number=2f,Power=5f;
		result=Math.pow(Number,Power);
		System.out.print("\nThe Power"+Power+" of"+Number+" is "+result);
		double Random = Math.random();
		System.out.println("\nThe Random Number"+Random);
		System.out.println("Size of Byte"+(Byte.SIZE));
		
	}
}
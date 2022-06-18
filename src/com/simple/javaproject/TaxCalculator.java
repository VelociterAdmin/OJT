package com.simple.javaproject;
/*
 * 	Write a program that defines a floating-point variable initialized with a dollar value for your
 * 	income and a second floating-point variable initialized with a value corresponding to a tax rate
 *	of 35 percent. Calculate and output the amount of tax you must pay with the dollars and cents
 *	stored as separate integer values (use two variables of type int to hold the tax, perhaps
 *	taxDollars and taxCents).
*/
public class TaxCalculator {

	public static void main(String[] args) {
		float income;
		income = 15000;
		float incomeInDollers ;
		incomeInDollers=income/78.04f;
		System.out.println(incomeInDollers);
		int doller = (int) incomeInDollers;
		int cents = (int) (Math.pow(10,3)*(incomeInDollers-doller));
		float taxDollers = 35/100f;
		float taxCents = 0.0035f;
		System.out.println("Dollers : "+doller+"\nCents   : "+cents);
		System.out.println("Tax on Dollers : "+incomeInDollers*taxDollers);
		System.out.println("Tax on Cents   : "+cents*taxCents);
	}
}

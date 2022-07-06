package com.velociter.chapter6;


public class MyClass {
	// This class can access any of the constants defined in ConversionFactors
	// by qualifying their names...
	public static double poundsToGrams(double pounds) {
		return pounds*ConversionFactor.POUND_TO_GRAM;
		}

}

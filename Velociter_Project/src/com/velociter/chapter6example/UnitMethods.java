package com.velociter.chapter6example;

public class UnitMethods implements UnitConversion {
	
public static double poundsToGrams(double pounds) {
	return ( pounds*POUND_TO_GRAM);
		
	}
public static double inchToMillimeter(double inch) {
	return (inch*INCH_TO_MM);
}
public static double ounceToGram(double ounce) {
	return (ounce*OUNCE_TO_GRAM);
}
public static double horsePowerToWatt(double horsePower) {
	return (horsePower*HP_TO_WATT);
}
public static void main(String[] args) {
	int pounds=20;
	int inch=10;
	int ounce=20;
	int horsePower=30;
	System.out.println("my weight in pound:"+pounds+" in grams"+(int)poundsToGrams(pounds) );
}
}

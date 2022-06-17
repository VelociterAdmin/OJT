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
public static double wattToHorsePower(double watt) {
	return (watt*WATT_TO_HP);
}
public static void main(String[] args) {
	int pounds=20;
	int inch=10;
	int ounce=20;
	int horsePower=30;
	int watt=1000;
	System.out.println("my weight in pound:"+pounds+" in grams"+(int)poundsToGrams(pounds) );
	System.out.println("my length in inch:"+inch+" in millimeter"+(int)inchToMillimeter(inch) );
	System.out.println("my weight in ounce:"+ounce+" in grams"+(int)ounceToGram(ounce) );
	System.out.println("my current in horsePower:"+horsePower+" in watt"+(int)horsePowerToWatt(horsePower) );
	System.out.println("my current in watt:"+watt+" in horsePower"+(int)wattToHorsePower(watt) );
}
}

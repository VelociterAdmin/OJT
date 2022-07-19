package com.velociter.chapter13;

import java.util.LinkedList;

public class TryAutoBoxing{

	static double temperature;

	public static void main(String[] args) {
	LinkedList<Double>temp=new LinkedList<Double>();

	// Insert 6 temperature values 0 to 25 degress Centigrade
	for(int i = 0 ; i<6 ; i++) {
	 temp.add(25.0*Math.random());
	}
	System.out.printf("%.2f degrees Fahrenheit%n",toFahrenheit(temp.getFirst()));
	Double value = null;
	while((value=temp.getFirst()!=null) {
	System.out.printf("%.2f degrees Fahrenheit %n", toFahrenheit(value));
	}
	}
	// Convert Centigrade to Fahrenheit
	public static double toFahrenheit(double temp) {
	return (1.8*temperature+32.0);
	}
	}

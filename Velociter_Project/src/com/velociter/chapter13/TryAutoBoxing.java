package com.velociter.chapter13;
// 1 example of chapter 13;

//In this code we are storing random temperature values of type double.
public class TryAutoBoxing {

	// Convert Centigrade to Fahrenheit
	public static double toFahrenheit(double temp) {
		return 1.8 * temp + 32.0;
	}

	public static void main(String[] args) {
		LinkedList<Double> temp = new LinkedList<Double>();

		// Insert 6 temperature values 0 to 25 degress Centigrade
		for (int i = 0; i < 6; i++) {
			temp.addItem(25.0 * Math.random());
		}
		
		for(Double value : temp) {
			System.out.println(toFahrenheit(value));
		}
		System.out.printf("%.2f degrees Fahrenheit %n", toFahrenheit(temp.getFirst()));
		Double value = null;
		while ((value = temp.getNext()) != null) 
		{
			System.out.printf("%.2f degrees Fahrenheit %n", toFahrenheit(value));

		}
	}
}

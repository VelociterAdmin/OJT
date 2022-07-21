package com.velociter.generics;

public class TryAutoBoxing {

	public static void main(String[] args) {

		LinkedList<Double> temperatures = new LinkedList<Double>();
		
		//Insert 6 Temperature value 0 to 25 Centigrade
		for(int i = 0 ; i < 7 ; i++ ) {
			temperatures.addItem(25.0*Math.random());
		}
//		temperatures.addItem(12.0);
//		temperatures.addItem(18.0);
//		temperatures.addItem(22.0);
		
//		for(Double v : temperatures) {
//			System.out.println(toFehrenheit(v));
//		}
		System.out.println();
		System.out.printf("%.2f degrees Fahrenheit %n",toFehrenheit(temperatures.getFirst()));	
		Double value = null;
		while((value = temperatures.getNext()) != null)
		{
			System.out.printf("%.2f degrees Fahrenheit %n",toFehrenheit(value));	
			
		}

	
	}
	
	
	public static double toFehrenheit(double temperature) {
		return 1.8*temperature+32.0;
	}
}

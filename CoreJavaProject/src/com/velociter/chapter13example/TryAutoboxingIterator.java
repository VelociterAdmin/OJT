package com.velociter.chapter13example;


public class TryAutoboxingIterator  {
	public static double toFahrenheit(double temperature)
	{
	  	return 1.8*temperature+32;
	}
public static void main(String[] args) {
	System.out.println("LinkedList Iterator");
	
	LinkedListIterator<Double> temperatures =new LinkedListIterator<Double>();
	for(int i=0; i<6;i++)
	{
		temperatures.addItem(25*Math.random());
	}
	System.out.printf("%.2f Degrees Fahrenheit",toFahrenheit(temperatures.getFirst()));
	Double value=null;
	while((value=temperatures.getNext())!=null)
	{
		System.out.printf("\n%.2f Degrees Fahrenheit",toFahrenheit(value));
	}
	
	
  }
}


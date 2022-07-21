package com.velociter.chapter13example;

//import java.util.LinkedList;

public class TryAutoboxing  {
	public static double toFahrenheit(double temperature)
	{
	  	return 1.8*temperature+32;
	}
public static void main(String[] args) {
	System.out.println("LinkedList");
	
	LinkedList<Double> temperatures =new LinkedList<Double>();
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
	
	
	
	
	
	
	
	





	
/*LinkedList<Double> temperatures = new LinkedList<Double>();
                                                                // Insert 6 temperature values 0 to 25 degress Centigrade
for(int i = 0 ; i<6 ; i++) {
temperatures.addItem(25.0*Math.random());
}
System.out.printf("%.2f degrees Fahrenheit%n",toFahrenheit(temperatures.getFirst()));
Double value = null;
while((value=temperatures.getNext()) != null) {
System.out.printf("%.2f degrees Fahrenheit%n", toFahrenheit(value));
}
}

                                                                   // Convert Centigrade to Fahrenheit
	public static double toFahrenheit(double temperature) {
		return 1.8 * temperature + 32.0;
	}
}*/
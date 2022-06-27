package com.velociter.chapter4;

import java.util.ArrayList;
/*
 * To save you having to wander around 10 different locations armed with a thermometer, you’ll generate
 * the temperatures as random values between -10 degrees and 35 degrees. This assumes you are recording
 * temperatures in degrees Celsius.
 */
public class ArrayOfArrays {

	public static void main(String[] args) {
		
		float[] avgTemp = new float[10];						//Create avgTemp for storing avg temperature
		int days=5,location=10;												// Create yr to store the year value
		float[][] temperature = new float[location][days];  			//Create float array Temperature to store the temperature
		ArrayList<String> city = new ArrayList<String>();		//Create Arraylist City to store the cities
//		Adding elements in city
		city.add("Indore");
		city.add("Bhopal");
		city.add("Mumbai");
		city.add("Pune");
		city.add("Hydrabad");
		city.add("Bangluru");
		city.add("Channai");
		city.add("Nagpur");
		city.add("Nasik");
		city.add("Dehli");
																		//Generate random temperature and storing it in temperature[]
		for(int i=0; i<temperature.length; i++) {
			for(int j=0;j < temperature[i].length; j++) {
				temperature[i][j] = (float) (100*Math.random()-50);

			}
		}
																		//Generating Average temperature and Displaying result
		for(int i=0; i<temperature.length; i++) {
			float sumTemp = 0.0f;
			for(int j=0; j< temperature[i].length; j++) {
				sumTemp += temperature[i][j];							//storing sum of all 365 days temperature corresponding location 

			}
				avgTemp[i] = sumTemp/(float)(temperature[i].length);		//storing average temperature in avgTemp[]
		}

																			//Verifying the temperature is correct or not
		
			for(int j=0; j< temperature[0].length; j++) {
				System.out.println("Temperature at "+city.get(0)+" on day "+(j+1)+" is\t"+temperature[0][j]+" c");
			}
				System.out.println();															//Printing All the cities Temperature
		for(int i=0;i<temperature.length; i++) {
			
//			System.out.println(i+1+"\tAverage Temperature in "+city.get(i)+"\tis :\t"+avgTemp[i]+" c");
			
		}
		
		System.out.println("\n"+(1)+" Average Temprature in "+city.get(0)+" is \t"+avgTemp[0]+" c");

	}

}

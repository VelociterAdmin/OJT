package com.velociter.chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
/*
 * To save you having to wander around 10 different locations armed with a thermometer, you’ll generate
 * the temperatures as random values between -10 degrees and 35 degrees. This assumes you are recording
 * temperatures in degrees Celsius.
 */
public class ArrayOfArrays {

	public static void main(String[] args) {
		
		float[] avgTemp = new float[10];						//Create avgTemp for storing avg temperature
		int yr=365;												// Create yr to store the year value
		float[][] temperature = new float[10][yr];  			//Create float array Temperature to store the temperature
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
				temperature[i][j] = (float) (45*Math.random()-10);

			}
		}
																//Generating Average temperature and Displaying result
		for(int i=0; i<temperature.length; i++) {
			float sumTemp = 0.0f;
			for(int j=0; j< temperature[i].length; j++) {
				sumTemp += temperature[i][j];					//storing sum of all 365 days temperature corosponding location 
				}
				avgTemp[i] = sumTemp/(float)(temperature[i].length);		//storing avrage temperature in avgTemp[]
		}
		
		for(int i=0;i<temperature.length; i++) {
			

				System.out.println(i+1+"\tAverage Temprature in "+city.get(i)+"\tis :\t"+avgTemp[i]+" c");

		}
		
		System.out.println("\n"+(3+1)+"\tAverage Temprature in "+city.get(3)+"\tis :\t"+avgTemp[3]+" c");

	}

}

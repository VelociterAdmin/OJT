package com.velociter.chapter3;
import java.util.ArrayList;

/*
 * To save you having to wander around 10 different locations armed with a thermometer, you’ll generate
 * the temperatures as random values between -10 degrees and 35 degrees. This assumes you are recording
 * temperatures in degrees Celsius. If you prefer Fahrenheit, you could generate values from 14 degrees     
 * to 95 degrees to cover the same range 
 */


public class ArrayOfArrays {

	public static void main(String[] args) {
		float[][] temperature = new float[10][365];  		//Create float array Temperature
		ArrayList<String> city = new ArrayList<String>();	//Create Arraylist City
//		Add elements in city
		city.add("Indore");
		city.add("Bhopal");
		city.add("Mumbai");
		city.add("Punee");
		city.add("Hydrabad");
		city.add("Bangluru");
		city.add("Channai");
		city.add("Nagpur");
		city.add("Nasik");
		city.add("Dehli");
// 		Generate random temperature and storing it in temperature
		for(int i=0; i<temperature.length; i++) {
			for(int j=0;j < temperature[i].length; j++) {
				temperature[i][j] = (float) (45*Math.random()-10);
			}
		}
		for(int i=0; i<temperature.length; i++) {
			for(int j=0;j < temperature[i].length; j++) {
				System.out.println(i+"\t"+j+"\t"+temperature[i][j]);
			}
		}
		
// Generating Average temperature and Displaying result
		for(int i=0; i<temperature.length; i++) {
			float average = 0.0f;
			for(int j=0; j< temperature[i].length; j++) {
				average += temperature[i][j];	
			}
			System.out.println("Average Temprature in "+city.get(i)+"\tis :\t"+average/(float)(temperature[i].length)+" c");
		}
	}

}

package com.velociter.chapter4;

import java.util.*;

//Chapter 4 Exercise 1;
/*
Create an array of String variables and initialize the array with the names of the months from
January to December. Create an array containing 12 random decimal values between 0.0 and
100.0. Display the names of each month along with the corresponding decimal value. Calculate
and display the average of the 12 decimal values.
*/
public class MonthsAndNumbers {

	public static void main(String[] args) {
		Map monthWithNumber = new HashMap();
		String[] months = new String[12]; 	//String Array
		float[] numbers = new float[12];	//Float Array
		months[0] = "January";				//Add elements to String Array
		months[1] = "Feburary";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "Janu";
		months[6] = "July";
		months[7] = "Augest";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		for(int i=0; i<months.length; i++) {		//Add elements to Float Array
			numbers[i] = (float) (12.0*Math.random());
			monthWithNumber.put(numbers[i] ,months[i] );
		}
		for(int i=0; i<months.length; i++) {		//Printing data along side decimal values
		//	System.out.println(months[i] +" : "+ numbers[i]);
		}
		Set mapToSet = monthWithNumber.entrySet();
		Iterator itr = mapToSet.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}

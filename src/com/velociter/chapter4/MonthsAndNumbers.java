package com.velociter.chapter4;

//Chapter 4 Exercise 1;

/*
 * Create an array of String variables and initialize the array with the names of the months from
 * January to December. Create an array containing 12 random decimal values between 0.0 and
 * 100+.0. Display the names of each month along with the corresponding decimal value. Calculate
 * and display the average of the 12 decimal values.
*/

public class MonthsAndNumbers {

	public static void main(String[] args) {
		//String Array months:
		String[] months = {"January","Feburary","March","April","May","Janu","July","Augest","September","October","November","December"}; 
		float[] numbers = new float[12];								//Float Array
		float sum=0.0f;
		
		for(int i=0; i<months.length; i++) {							//Add elements to Float Array
			numbers[i] = (float) (100.0*Math.random());
			
		}
		
		
		for(int i=0; i<months.length; i++) {							//Printing data along side decimal values
			System.out.println(months[i] +"     \t: "+ numbers[i]);
		}
		
for(int i=0;i<12;i++) {
			
			sum = sum+numbers[i];
			
		}
		System.out.println("\nAverage Number:"+sum/numbers.length);
		
		System.out.println("\n"+months[2] +"  \t: "+ numbers[2]);			//Printing a particular city's Average Temperature
	}
	

}

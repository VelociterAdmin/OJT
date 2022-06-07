package com.velociter.chapter4;

public class DislpayMonthAndDecimal {

	public static void main(String[] args) {
		String[] months= {"january","february","march","april","may","june","july","august","september","october","november","december"};
		double[] decimalNumber= new double[12];
		
		double avg=0;
		for(int i=0;i<decimalNumber.length;i++) 
		{
			decimalNumber[i]=100*Math.random();
			System.out.println(months[i]+" "+decimalNumber[i]);
		}
	
		
		for(int a=0;a<decimalNumber.length;a++)
		{
			avg += decimalNumber[a];
			
		}
		System.out.print("AVERAGE:");
		avg /= decimalNumber.length;
		System.out.println(avg);

	}

}

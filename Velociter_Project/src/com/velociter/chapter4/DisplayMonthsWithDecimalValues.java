package com.velociter.chapter4;

public class DisplayMonthsWithDecimalValues {

	public static void main(String[] args) {
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        double average=0.0;
        double[] decimalNumber=new double[12];
        
        for(int i=0;i<decimalNumber.length;i++) {
        	decimalNumber[i]=100*Math.random();
        	System.out.println(months[i]+" "+decimalNumber[i]);
      
        	average +=decimalNumber[i];
        	
        }
       System.out.println("Average");
        	average/=decimalNumber.length;
        	System.out.println(average);
        	
	}

}

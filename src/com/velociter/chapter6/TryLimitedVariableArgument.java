package com.velociter.chapter6;

public class TryLimitedVariableArgument {

	public static void main(String[] args) {
		System.out.println(average(1.0,2.0,3.0,4.0,5.0));
		System.out.println(average(3.14, 1.414, 1.732));
		System.out.println(average(new Double(7),new Double(8),new Double(9),new Double(10)));
	}
	
	//Average a variable number of the value
	public static double average(Double ...args) {
		if(args.length==0)
			return 0.0;
		double ave = 0.0;
		for(Double value : args) 
			ave += value;
		return ave/args.length;
	}
	
}

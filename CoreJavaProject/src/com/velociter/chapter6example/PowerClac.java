package com.velociter.chapter6example;

public class PowerClac {

	public static void main(String[] args) {
		double x=5.0;
		System.out.println(x + " to the power 4 is " + power(x,4));
       
	}
    static double power(double x,int n)
    {
    	if(n>1) {
        return x*power(x,n-1);
    }
    else if(n<0)
		return 1.0/power(x,-n);
    else
    	return n==0?1.0:x;
 }
}

package com.velociters.chapter8;

public class RendomNumber20 {

	public static void main(String[] args) {
		int min=-50;                                //declared an integer min and initialized it by -50
		int max=50;                                 //declared an integer max and initialized it by 50
		int count=0;
		int i;                                      //declared an integer i
		System.out.println("Random number generate "+min+" to "+max+" :");
		for(i=1;i<21;i++) {
			double d=Math.random()*(max-min+1)+min;
			System.out.print(i + ")" +d+"   ");
			if(++count%5==0) {
				System.out.println("\n");
			}
		}

	}

}

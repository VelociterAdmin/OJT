package com.velociter.chapter4;

public class Array {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		int[] number = new int[101];
		for(int i=0; i<20; i++) {
			
			number[i] = (int) (Math.random()*100-50 );
		}
		for(int i=0; i<20; i++) {
			System.out.print(i+":"+number[i]+" \n");
		}
	
	}

}

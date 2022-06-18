package com.simple.javaproject;

public class SqreRootMethod {

	public static void main(String[] args) {
		int nNumber=25;
		int i,j;
		
		for(i=2;i<=Math.sqrt(nNumber);i++) {
			for(j=2;j<i;j++) {
				if(i%j==0)
					break;
			}
				if(j==i) {
					System.out.println(i);
				}
			}
			
		}
	}

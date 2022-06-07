package com.velociter.chapter5;

public class Autoboxing {

	public static void main(String[] args) {  
		int[] values = { 2, 23, 45, 224, 4567 };
		Integer[] objs = new Integer[values.length]; 
		
		for(int i = 0 ; i<values.length ; i++) {
		objs[i] = boxInteger(values[i]);
		}
		
		for(Integer intObject : objs) {
		unboxInteger(intObject);
		}
		}
		
		public static Integer boxInteger(Integer obj) {
		return obj;
		}
		
		public static void unboxInteger(int n) {
		System.out.println(""+ n);
		}
		} 
			   
			

	



package com.velociters.chapter5example;

public class AutoBoxing {
	public static void main(String[] args)
	{
		int []values= {1,2,3,4,5};
		Integer [] objs=new Integer[values.length];
		
		for (int i=0;i<values.length;i++)
		{
		System.out.println(objs[i] = boxInteger(values[i]));
		}
	 for(Integer intObject : objs) {
		unboxInteger(intObject);
		}
		}
	public static Integer boxInteger(Integer obj) {
		return obj;
		}
		public static void unboxInteger(int n) {
		System.out.println("Values= "+n);
		}
}
		
	


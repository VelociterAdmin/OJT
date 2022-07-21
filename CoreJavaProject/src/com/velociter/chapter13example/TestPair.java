package com.velociter.chapter13example;

public class TestPair {
	public static void main(String[] args) {
	
	Pair<Integer,String> list1=new Pair<Integer,String>(2,"Two");
	  Pair<Integer,Double> list2=new Pair<Integer,Double>(25,5.4);
	  System.out.println(" key :"+ list1.getKey()+" "+" value :"+list1.getValue()); 
	  System.out.println(" key :"+ list2.getKey()+" "+" value :"+ list2.getValue());
	}
}

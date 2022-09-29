package com.velociter.generics;

public class TestClassType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Double> proverbs = new LinkedList<Double>();
		LinkedList<String> numbers = new LinkedList<String>();
		
		System.out.println("Number class are :"+numbers.getClass().getName());
		System.out.println("Proverb class are :"+proverbs.getClass().getName());
		System.out.println("Compare class Objects :"+numbers.getClass().getName().equals(proverbs.getClass().getName()));
	}
}
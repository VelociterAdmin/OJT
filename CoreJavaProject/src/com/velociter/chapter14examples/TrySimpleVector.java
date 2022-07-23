package com.velociter.chapter14examples;

import java.util.Vector;

public class TrySimpleVector {
	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		Vector<Integer> num=new Vector<Integer>();
		Vector<String> strings=new Vector<String>();
		
		String[] firstnames = { "Jack", "Jill", "John", "Joan", "Jeremiah", "Josephine" };
		// Add the names to the vector
		for (String firstname : firstnames)
		{
			names.add(firstname);
		}
		// List the contents of the vector
		for (String name : names) {
			System.out.println(name);
		}
		Integer[] theNum= {1,2,3,4,5,6,7,8,9};
		for(Integer aNum:theNum )
		{
			num.add(aNum);
		}
		
		for(Integer n: num)
		{
			System.out.println(n);
		}
		String[] ArrayS= {"1","2","3"};
		for(String s:ArrayS) {
			strings.add(s);
		}
		
		names.addAll(strings);
		System.out.println(names);
		names.removeAll(names);
		System.out.println(names);
		
	}
}

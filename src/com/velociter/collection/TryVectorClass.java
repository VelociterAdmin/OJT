package com.velociter.collection;

import java.util.Vector;

public class TryVectorClass {
	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		Vector<String> names2 = new Vector<String>();
		String [] firstnames = {"Jack","John","Jill","Joan","Jeremiah","Josephine","JohnWick"};
		String[] giru = {"giruru","guurururur"};
		 
		//Add the names to the vector
		for(String firstname : firstnames) {
			names.add(firstname);	
		}
		
		for(String n2 : giru) {
			names2.add(n2);
		}
		
		//List the content of the vector
		for(String name : names) {
			System.out.print(name +" ");
		}
		System.out.println();
		
		for(String name : names2) {
			System.out.print(name +" ");
		}

		System.out.println("\nafter adding");
		names.addAll(names2);
		for(String name : names) {
			System.out.print(name +" ");
		}
		names.removeAll(names2);
		System.out.println("\nafter removing");
		for(String name : names) {
			System.out.print(name +" ");
		}
	}
}

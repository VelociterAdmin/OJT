package com.velociter.collection;

import java.util.Vector;

public class TryVectorClass {
	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		String[] firstnames = {"Jack","John","Jill","Joan","Jeremiah","Josephine"};
		
		//Add the names to the vector
		for(String firstname : firstnames) {
			names.add(firstname);	
		}
		
		//List the content of the vector
		for(String name : names) {
			System.out.println(name);
		}
	}
}

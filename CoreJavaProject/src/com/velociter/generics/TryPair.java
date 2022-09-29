
package com.velociter.generics;

public class TryPair {

	public static void main(String[] args) {
	Pair<String, String> entry = new Pair<String, String>("Freed", "211 222 223");
	Pair<Integer, Integer> entry2 = new Pair<Integer, Integer>(420, 516);
	
	System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
//	System.out.println("Key :"+entry2.getKey()+" Value :"+entry2.getValue());
	entry.setKey("Deo");
	entry.setValue("John");
	System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
	}

}

package com.velociter.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TrySerializationLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(int i = 0 ; i<10 ; i++) {
		numbers.addItem(1+(int)(100.0*Math.random())); // Add ten random integers 1 to 100
		}
		System.out.println("numbers list contains:");
		listAll(numbers);              // List contents of numbers
		// Now serialize the list to a file
		String filename = "F:\\new\\WriteFile.txt";
		try {
		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(filename));
		objOut.writeObject(numbers);
		objOut.close();
		} catch(IOException e) {
		e.printStackTrace();
		System.exit(1);
		}
		LinkedList<Integer> values = null; // Variable to store list from the file
		// Deserialize the list from the file
		try {
		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename));
		values = (LinkedList<Integer>)(objIn.readObject());
		objIn.close();
		} catch(IOException e) {
		e.printStackTrace();
		System.exit(1);
		} catch(ClassNotFoundException e) {
		e.printStackTrace();
		System.exit(1);
		}
		System.out.println("\nvalues list contains:");
		listAll(values); // List contents of values
		}
		
		// Helper method to list the contents of a linked list
		static void listAll(LinkedList<Integer> list) {
		Integer number = list.getFirst();
		int count = 0;
		do {
		System.out.printf("%5d",number);
		if(++count%5 == 0 ) {
		System.out.println();
		}
		} while((number = list.getNext()) != null);
		}
	}
		

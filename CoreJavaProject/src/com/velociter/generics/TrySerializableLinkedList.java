package com.velociter.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TrySerializableLinkedList {
	public static void main(String[] args) {
		String fileName = "C:/MyFile.txt";
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(int i = 0; i<10 ; i++) {
			numbers.addItem(1+(int)(Math.random()*100));					//Add 10 random number in the range of 1 - 100
		}
		System.out.println("\n Numbers contain");
		listAll(numbers);													//List all the contain of  numbers
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName));
			objOut.writeObject(numbers);
			objOut.close();
		}catch (Exception e) {
		e.printStackTrace();
		System.exit(1);
		}
		
		LinkedList<Integer> values = null;									//variable to store list from the file
		
		//DeSerialize the list from the file
		try {
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName));
			values = (LinkedList<Integer>) (objIn.readObject());
			objIn.close();
		}catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		System.out.println("\nvalues list contains:");
		listAll(values);
	}
	
	//Helper method of list the contents of a linkedlist
	public static void listAll(LinkedList<Integer> list) {
		Integer number = list.getFirst();
		int count = 0;
		do {
			System.out.printf("%5d",number);
			if(++count%5==0)
				System.out.println();
		}while((number = list.getNext()) != null);
	}
}


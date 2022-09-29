//package com.velociter.collection;
//
//import java.io.IOException;
//import java.util.ListIterator;
//import java.util.Vector;
//
//import com.velociter.generics.Person;
//
//public class TryVector {
//
//	public static void main(String[] args) {
//		Person aPerson = null;										//person object	
//		Vector<Person> filmCast = new Vector<Person>();
//		//Populate the film cast
//		for(;;) {													//Infinite loop
////			aPerson.readPerson();									//Read in film star
//			if(aPerson == null) {									//if null is obtained
//				break;												//we are done
//			}
//			filmCast.add(aPerson);									//otherwise.. add to cast
//		}
//		int count = filmCast.size();
//		System.out.println("You added "+count+(count==1?"Person":"People"+" to the cast.\n"));
//		System.out.println("The vector currently has room for"+(filmCast.capacity()+count)+" more people");
//		
//		// Show who is in the cast using an iterator
//		ListIterator<Person> thisLot = filmCast.listIterator();
//		
//		while(thisLot.hasNext()) {									//Output all the element
//			System.out.println(thisLot.next());
//		}
//		
//	}
//	static Person readPerson() {
//		// Read in the first name and remove blanks front and back
//		String firstName;
//		String surName;
//		System.out.println("Enter firstname or ! to end");
//		try {
//			firstName = keyboard.readLine().trim();
//			
//			if(firstName.charAt(0)=='!') {
//				return null;
//			}
//			// Read in the surname, also trimming blanks
//			System.out.println("Enter surname:");
//			surName = keyboard.readLine().trim();							//Read and trim a string
//		}catch(IOException e) {
//			System.out.println("Error in reading a name:");
//			e.printStackTrace();
//			System.exit(1);
//		}
//		return new Person()
//	}
//}
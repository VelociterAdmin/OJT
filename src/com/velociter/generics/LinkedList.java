package com.velociter.generics;

import java.io.Serializable;
import java.util.Iterator;

//public class LinkedList<T extends Serializable> implements Serializable {
//	// Default constructor - creates an empty list
//	public LinkedList(){}
//	// Constructor to create a list containing one object
//	public LinkedList(T item) {
//		System.out.println("Def con");
//		if(item != null) {
//			current=end=start=new ListItem(item); 						// item is the start and end
//		}
//	}
//	
//	
//	// Construct a linked list from an array of objects
//	public LinkedList(T[] items) {
//		System.out.println("arr con");
//		if(items != null) {
//			
//			// Add the items to the list
//			for(int i = 0; i < items.length; i++) {
//				addItem(items[i]);
//			}
//				current = start;
//		}
//	}
//	
//	// Add an item object to the list
//	public void addItem(T item) {
//		ListItem newEnd = new ListItem(item); 							// Create a new ListItem
//		if(start == null) { 											// Is the list empty?
//		start = end = newEnd; 											// Yes, so new element is start and end
//		} 
//		else { 															// No, so append new element
//		end.next = newEnd;												// Set next variable for old end
//		end = newEnd; 													// Store new item as end
//		}
//	}
//	// Get the first object in the list
//	public T getFirst() {
//		current = start;
//		return start == null ? null : start.item;
//	}
//	// Get the next object in the list
//	public T getNext() {
//	if(current != null) {
//	current = current.next; 											// Get the reference to the next item
//	}
//	return current == null ? null : current.item;
//	}
//	private ListItem start = null; 										// First ListItem in the list
//	private ListItem end = null; 										// Last ListItem in the list
//	private ListItem current = null; 									// The current item for iterating
//	
//	
//	private class ListItem implements Serializable {
//		
//		// Constructor
//		public ListItem(T item) {
//		this.item = item; // Store the item
//		next = null; // Set next as end point
//		}
//		// Return class name & object
//		public String toString() {
//		return "ListItem " + item ;
//		}
//		ListItem next;													// Refers to next item in the list
//		T item; 														// The item for this ListItem
//	}
//}



public class LinkedList<T> implements Iterable<T> {
	
	public Iterator<T> iterator(){
		
		return new ListIterator(); // Create iterator of the inner class type
	}
	
	//Inner class difining iterator object for the linked list
	private class ListIterator implements Iterator<T>{
		//Constructor
		public ListIterator() {
			nextElement = getFirst();
		}
		
		//method to test whether more elements are availiable
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return nextElement != null;
		}

		
		@Override
		public T next() {
			// TODO Auto-generated method stub
			T element = nextElement;
			if(element == null) {
				throw new java.util.NoSuchElementException();
				
			}
			nextElement = getNext();
			return element;
		}
		// Method to remove the last element retrieved from the linked list
		// You don’t want to support this operation for the linked list
		// so just throw the exception
		public void remove() {
			throw new IllegalStateException();
		}
		private T nextElement;
	}
	
	// Default constructor - creates an empty list
	public LinkedList(){}
	// Constructor to create a list containing one object
	public LinkedList(T item) {
		System.out.println("Def con");
		if(item != null) {
			current=end=start=new ListItem(item); 						// item is the start and end
		}
	}
	
	
	// Construct a linked list from an array of objects
	public LinkedList(T[] items) {
		System.out.println("arr con");
		if(items != null) {
			
			// Add the items to the list
			for(int i = 0; i < items.length; i++) {
				addItem(items[i]);
			}
				current = start;
		}
	}
	
	// Add an item object to the list
	public void addItem(T item) {
		ListItem newEnd = new ListItem(item); 							// Create a new ListItem
		if(start == null) { 											// Is the list empty?
		start = end = newEnd; 											// Yes, so new element is start and end
		} 
		else { 															// No, so append new element
		end.next = newEnd;												// Set next variable for old end
		end = newEnd; 													// Store new item as end
		}
	}
	// Get the first object in the list
	public T getFirst() {
		current = start;
		return start == null ? null : start.item;
	}
	// Get the next object in the list
	public T getNext() {
	if(current != null) {
	current = current.next; 											// Get the reference to the next item
	}
	return current == null ? null : current.item;
	}
	private ListItem start = null; 										// First ListItem in the list
	private ListItem end = null; 										// Last ListItem in the list
	private ListItem current = null; 									// The current item for iterating
	
	
	private class ListItem {
		
		// Constructor
		public ListItem(T item) {
		this.item = item; // Store the item
		next = null; // Set next as end point
		}
		// Return class name & object
		public String toString() {
		return "ListItem " + item ;
		}
		ListItem next; 	// Refers to next item in the list
		T item; 		 // The item for this ListItem
	}

}
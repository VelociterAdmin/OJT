package com.velociter.chapter13;

public class LinkedList<T> {
	private ListItem start = null;               // First ListItem in the list
	private ListItem end = null;              // Last ListItem in the list
	private ListItem current = null;            // The current item for iterating
	
	// Default constructor - creates an empty list
	public LinkedList() {}
	// Constructor to create a list containing one object
	public LinkedList(Object item) {
	if(item != null) {
	current=end=start=new ListItem(item);    // item is the start and end
	}
	}
	// Construct a linked list from an array of objects
	public LinkedList(Object[] items) {
	if(items != null) {
	// Add the items to the list
	for(int i = 0; i < items.length; i++) {
	addItem(items[i]);
	}
	current = start;
	}
	}
	// Add an item object to the list
	public void addItem(Object item) {
	ListItem newEnd = new ListItem(item);       // Create a new ListItem
	if(start == null) {                 // Is the list empty?
	start = end = newEnd;                 // Yes, so new element is start and end
	} else {                    // No, so append new element
	end.next = newEnd;              // Set next variable for old end
	end = newEnd;                     // Store new item as end
	}
	}
	// Get the first object in the list
	public Object getFirst() {
	current = start;
	return start == null ? null : start.item;
	}
	// Get the next object in the list
	public Object getNext() {
	if(current != null) {
	current = current.next;          // Get the reference to the next item
	}
	return current == null ? null : current.item;
	}
	
	private class ListItem {
		// Constructor
		public ListItem(Object item2) {
		this.item = item2;              // Store the item
		next = null;                   // Set next as end point
		}
		// Return class name & object
		public String toString() {
		return "ListItem " + item ;
		}
		ListItem next;            // Refers to next item in the list
		Object item;             // The item for this ListItem
	}
	 
		}
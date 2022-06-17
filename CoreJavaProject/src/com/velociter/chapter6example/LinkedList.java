package com.velociter.chapter6example;

public class LinkedList {
	private ListItem start = null;
	private ListItem end = null;
	private ListItem current = null;

	LinkedList(){
		
	}
	LinkedList(Object item){
		
		if(item!=null) {
			current=end=start=new ListItem(item);
		}
	}
	public LinkedList(Object[] items) {
		if(items != null) {
		for(int i = 0; i < items.length; i++) {
		addItem(items[i]);
		}
		current = start;
		}
		
	}
	public void addItem(Object item) {
		public void addItem(Object item) {
			ListItem newEnd = new ListItem(item); 
			if(start == null) { 
			start = end = newEnd;
			} else { 
			}
			end.next = newEnd;
			end = newEnd; 
			}
		
	}
	
 }


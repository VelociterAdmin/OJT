package com.velociter.chapter6example;

public class LinkedList {
	private ListItem start=null;
	private ListItem end=null;
	private ListItem current=null;
	
	public LinkedList() {
		
	}
	public LinkedList(Object item) {
		if(item !=null) {
			current=start=end=new ListItem(item);
		}
		
	}
	public LinkedList(Object[] items) {
		if(items !=null) {
			for(int i=0;i<items.length;i++) {
				addItem(items[i]);
			}
			current=start;
		}
		
	}
	public void addItem(Object item) {
		ListItem newEnd=new ListItem(item);
		if(start==null) {
	   System.out.println(start=end=newEnd);
		}else {
			end.next=newEnd;
			System.out.println(end=newEnd);
			
		}
		
		
	}
	public Object getFirst() {
		current = start;
		return start == null ? null : start.item;
		}
   public Object getNext() {
	  if(current !=null) {
		  current.next=current;  
	  }
	  return current == null ? null : start.item;
   }
       public static void main(String[] args) {
		ListItem item=new ListItem(25);
		System.out.println(item.item);
	    LinkedList list=new LinkedList();
	    list.addItem(23);
		
			
			
		}
}

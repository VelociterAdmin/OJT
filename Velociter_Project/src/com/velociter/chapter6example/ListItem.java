package com.velociter.chapter6example;

public class ListItem {
  ListItem next;
  Object item;
  
  public ListItem(Object item) {
	  this.item=item;
	  next=null;
  }
  public String toString() {
	  return "ListItem"+ item;
  }
public void setNext(ListItem newEnd) {
	// TODO Auto-generated method stub
	
}
public void setPrevious(ListItem end) {
	// TODO Auto-generated method stub
	
}
}

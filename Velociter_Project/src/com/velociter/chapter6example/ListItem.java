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
}

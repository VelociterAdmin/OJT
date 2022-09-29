package com.velociter.extendingclasses;

public class ListItem {
	//Constructor
	public ListItem(Object item) {
		this.item = item;						//Store the item
		next = null;							//set next as end
	}
	
	//Return Class name and object
	public String toString() {
		return "ListItem" +item;
	}
	
	ListItem next;								//refer to next item in the list
	Object item;								//the item for this ListItem
}

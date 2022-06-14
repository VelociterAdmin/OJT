package com.velociter.chapter6example;

public class ListPoint {
private ListPoint next;
private Point point;

public ListPoint(Point point) {
	this.point=point;
	next=null;
	
}

public void setNext(ListPoint next)	{
	this.next=next;
	
}
public ListPoint getNext() {
	return next;
	
}
public String toString() {
	return ("+point+");
	
}
}



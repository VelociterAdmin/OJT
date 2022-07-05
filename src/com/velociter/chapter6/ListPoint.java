package com.velociter.chapter6;

public class ListPoint {

	//Constructor
	public ListPoint(Point point) {
		this.point = point;											//Store point refrence
		next = null;												//set next listpoint as null
	}
	
	//set the pointer to the next ListPoint 
	public void setNext(ListPoint next) {
		this.next = next;
	}
	
	//get the next point in the list
	public ListPoint getNext(){
		return next;												//return the next point
	}
	
	//Return string representation
	public String toString() {
		return 	"("+point+")";
	}
	
	private ListPoint next;											//Refer to the next point 
	private Point point;											//The point for list point
	
}

package com.velociter.chapter6_2;

public class ListPoint {
	private ListPoint next; 
	private Point point; 
		public ListPoint(Point point) {
		this.point = point; 
		next = null; 
		}
		
		public void setNext(ListPoint next) {
		this.next = next; 
		}
		
		public ListPoint getNext() {
		return next; 
		}
		
		public String toString() {
		return "(" + point + ")";
		}

}



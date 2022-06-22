package com.velociter.chapter6modifiedquestions;


public class ListPoint {
	private Point next; 
	private Point point; 
	
		
		public ListPoint(Point point) {
		this.point = point; 
		next = null; 
		}
		
		public void setNext(Point newEnd) {
		this.next = newEnd; 
		}
		
		public Point getNext() {
		return next; 
		}
		
		public String toString() {
		return "("+ point + ")";

		}
}

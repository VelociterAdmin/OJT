package com.velociter.chapter6modifiedquestions;

import com.velociter.chapter5.Point;

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
		return "("+ point + ")";

		}
}

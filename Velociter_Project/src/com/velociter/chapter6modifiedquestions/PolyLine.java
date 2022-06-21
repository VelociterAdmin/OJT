package com.velociter.chapter6modifiedquestions;

import com.velociter.chapter5.Point;

public class PolyLine {
	private ListPoint start; 
	private ListPoint end; 
	public PolyLine(Point[] points) {
		if(points != null) { 
		for(Point p : points) {
		addPoint(p);
		}

		public void addPoint(Point point) {
		ListPoint newEnd = new ListPoint(point); 
		if(start == null) {
		start = newEnd; 
		} else {
		end.setNext(newEnd); 
		}
		end = newEnd; 
		}
		
		public String toString() {
		StringBuffer str = new StringBuffer("Polyline:");
		ListPoint nextPoint = start; 
		while(nextPoint != null) {
		str.append(" "+ nextPoint); 
		nextPoint = nextPoint.getNext(); 
		}
		return str.toString();
		}
		public void addPoint(double x, double y) {
			addPoint(new Point(x, y));
		
	}
		public PolyLine(double[][] coords) {
			if(coords != null) {
			for(int i = 0; i < coords.length ; i++) {
			addPoint(coords[i][0], coords[i][1]);
			}
			}
		}

}

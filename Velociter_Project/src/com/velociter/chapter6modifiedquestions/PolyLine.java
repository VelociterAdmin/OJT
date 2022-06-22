package com.velociter.chapter6modifiedquestions;


public class PolyLine extends NewShape {
	private Point start; 
	private Point end; 
	
	
	public PolyLine(Point[] points) {
		if(points != null) { 
		for(Point p : points) {
        addPoint(p);
		}
		}
	}
		public PolyLine(double[][] coords) {
			if(coords != null) {
			for(int i = 0; i < coords.length ; i++) {
			addPoint(coords[i][0], coords[i][1]);
			}
			}
			}
			
	public void addPoint(double x, double y) {
	addPoint(new Point(x, y));
	}
			
		public void addPoint(Point point) {
		Point newEnd = new Point(point); 
		if(start == null) {
		start = newEnd; 
		} else {
		end.setNext(newEnd); 
		}
		end = newEnd; 
		}
		
		public String toString() {
		StringBuffer str = new StringBuffer("Polyline:");
		Point nextPoint = start; 
		while(nextPoint != null) {
		str.append(" "+ nextPoint); 
		nextPoint = nextPoint.getNext(); 
		}
		return str.toString();
		}
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
		
		
			}
	

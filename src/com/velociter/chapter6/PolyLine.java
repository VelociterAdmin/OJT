//package com.velociter.chapter6;
//
//public class PolyLine {
//	//Create a polyline with the help of array of point
//	public PolyLine(Point[] points) {
//		if(points != null) {								//Make sure there is an array
//			for(Point p : points) {
//				addPoint(p);
//			}
//		}
//	}
//
//	
//	//Construct a Polyline from an array of cordinates 
//	PolyLine(double[][] coords){
//		if(coords != null) {
//			for(int i = 0; i<coords.length; i++) {
//				addPoint(coords[i][0],coords[i][1]);
//			}
//		}
//	}
//	
//	//Add points object to the list
//	public void addPoint(Point point) {
//		ListPoint newEnd = new ListPoint(point);			//Create a new ListPoint
//		if(start== null) {
//			start = newEnd;
//		}
//		else {
//			end.setNext(newEnd);
//		}
//		end = newEnd;
//	}
//	
//	//Add a point defined by a cordinate pair to the list
//	public void addPoint(double x,double y) {
//		addPoint(new Point(x,y));
//	}
//	
//	//String representation of a polyline
//	public String toString() {
//		StringBuffer str = new StringBuffer("PolyLine:");
//		ListPoint nextPoint = start;
//		while(nextPoint != null) {
//			str.append(" "+nextPoint);
//			nextPoint = nextPoint.getNext();
//		}
//		return str.toString();
//	}
//	private ListPoint start,end;
//}

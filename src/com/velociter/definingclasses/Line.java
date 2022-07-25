package com.velociter.definingclasses;

public class Line {	
	Point start;													//Start Point of line
	Point end;														//End Point of line
	
	//Create a line from two point
	Line(final Point start,final Point end){
		this.start = new Point(start);
		this.end = new Point(end);
	}
	
	//Create line from two cordinates pairs
	Line(double xStart, double yStart, double xEnd, double yEnd){
		start = new Point(xStart, yStart);							//create start point
		end = new Point(xEnd, yEnd);								//create end point
	}
	
	//Calculate Length of line
	double length() {
		return start.distance(end);									//use the method from PointClass
	}
	
	//Convert a line into a String
	public String toString() {
		return "("+start+"):("+end+")";								//As "(start):(end)"
	}																//that is, "(x1, y1):(x2, y2)"
	
}

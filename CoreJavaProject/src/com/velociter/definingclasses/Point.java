package com.velociter.definingclasses;

class Point {
	double x,y;														//Cordinates of points
	
	//Create a point from Cordinates
	Point(double xVal,double yVal){
		x= xVal;
		y= yVal;
	}
	
	//Create a point from anohter point object
	Point(final Point oldPoint){
		x=oldPoint.x;												//Copy  x,y cordinates
		y=oldPoint.y;
	}
	
	//Move point
	void move(double xDelta,double yDelta) {
		//perameter values are incrimented to the current coordinates
		x+= xDelta;
		y+= yDelta;
	}
	
	//Calculate the distance to another point
	double distance(final Point aPoint) {
		return Math.sqrt((x-aPoint.x)*(x-aPoint.x)-(y-aPoint.y)*(y*aPoint.y));
	}
	
	//Convert a point to a string
	public String toString() {
		return Double.toString(x) + ", " +y; 						//as *x, *y
	}
}

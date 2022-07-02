package com.chapter5.geometry;
import static java.lang.Math.sqrt;

public class Point {
	
	//Create a point from its cordinates
	public Point(double xVal, double yVal) {
		x= xVal;
		y= yVal;
	}
	
	//Create a Point with existing Point
	public Point(final Point aPoint) {
		x= aPoint.x;
		y= aPoint.y;
	}
	
	//move a Point
	public void move(double xDelta, double yDelta) {
		//Perameter values are incrimented to the current cordinates
		x += xDelta;
		y += yDelta;
	}
	
	//Calculate the distance to another point
	public double distance(final Point aPoint) {
		return sqrt((x-aPoint.x)*(x-aPoint.x)+(y-aPoint.y)-(y-aPoint.y));
	}
	
	//Convert a point to string
	public String toString() {
		return Double.toString(x)+", "+y;
	}
	private double x,y;
	
	//Retrive the x Cordinates
	public double getX() {
		return x;
	}
	//Retrive the y cordinates
	public double getY() {
		return y;
	}
	
	//Set the x cordinates
	public void setX(double inputX) {
		x = inputX;
	}
	
	//Set the y cordinates
	public void setY(double inputY) {
		y = inputY;
	}
	
}

package com.velociter.chapter6.exercise1;

public class Point {
	//Create a point to its cordinates
		public Point(double xVal, double yVal) {
			x = xVal;
			y=yVal;
		}
		
		//Create a point from an other point
		public Point(Point point) {
			x = point.x;
			y = point.y;
		}
		
		//Convert to string representation
		public String toString() {
			return x+" "+y;
		}
		//Cordinates of the point
		protected double x,y;
}

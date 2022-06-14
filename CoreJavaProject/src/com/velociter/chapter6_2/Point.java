package com.velociter.chapter6_2;

public class Point {
	protected double x1;
	protected double y1;
	public Point(double xVal, double yVal) {
	x1 = xVal;
	y1 = yVal;
	}
	
	public Point(Point point) {
	x1 = point.x1;
	y1 = point.y1;
	}
	
	public String toString() {
	return x1+"'"+y1;
	}

	public double distance(Point end) {
		return 0;
	}
	
	
}
	

package com.velociter.exceptionexercise;
/*
 * 
 * 
 * 
 */


public class Rectangle extends Shape{
	Point topLeft;
	Point bottomRight;
	public Rectangle(double x1Coords, double y1Coords, double x2Coords, double y2Coords) {
		// TODO Auto-generated constructor stub
		topLeft = new Point(Math.min(x1Coords, x2Coords),Math.min(y1Coords, y2Coords));
		bottomRight = new Point(Math.max(x1Coords, x2Coords),Math.max(y1Coords, y2Coords));
	}
	
	public Rectangle (Rectangle react) {
		topLeft = new Point(react.topLeft);
		bottomRight = new Point(react.bottomRight);
	}
	
	
	public Rectangle(Point tp, Point br) {
//	System.out.println("rpp");
	}

	public Rectangle encloses(Rectangle react) {
		return new Rectangle(	Math.min(topLeft.getX(), react.topLeft.getX()),
								Math.min(topLeft.getY(), react.topLeft.getY()),
								Math.max(bottomRight.getX(), react.bottomRight.getX()),
								Math.max(bottomRight.getY(), react.bottomRight.getY()));
	}
	
	//String Representation of Rectangle
	@Override
	public String toString() {
		return "Rectangle : "+topLeft+" , "+bottomRight;
	}
	
	@Override
	public void show() {
		System.out.println("\n"+toString());
	}

}

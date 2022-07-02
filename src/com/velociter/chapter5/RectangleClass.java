package com.velociter.chapter5;
/*
 *  Define a class for rectangle objects defined by two points, the top-left and bottom-right corners
 *  of the rectangle. Include a constructor to copy a rectangle, a method to return a rectangle object
 *  that encloses the current object and the rectangle passed as an argument, and a method to display 
 *  the defining points of a rectangle. Test the class by creating four rectangles and combining
 *  these cumulatively to end up with a rectangle enclosing them all. Output the defining points of
 *  all the rectangles you create.
 */ 

public class RectangleClass {

	public static void main(String[] args) {
//		Point start = new Point(2.0,4.0);
//		Point end = new Point(5.0,2.0);
		Line line1 = new Line((2.0),(2.0),(2.0),(4.0));
		Line line2 = new Line(2.0,4.0,5.0,4.0);
		Line line3 = new Line(5.0,4.0,5.0,2.0);
		Line line4 = new Line(5.0,2.0,2.0,2.0);
		System.out.println("created lines are : "+line1+" , "+line2+" , "+line3+" and"+line4);
		
	}
}

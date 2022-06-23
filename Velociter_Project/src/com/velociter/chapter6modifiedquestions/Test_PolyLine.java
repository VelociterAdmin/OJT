package com.velociter.chapter6modifiedquestions;

import com.velociter.chapter5.Rectangle;

public class Test_PolyLine {

	public static void main(String[] args) {
		   double[][] coords = { {1., 1.}, {1., 2.}, { 2., 3.},
                                 {-3., 5.}, {-5., 1.}, {0., 0.} };

		   PolyLine polygon = new PolyLine(coords);
		   System.out.println(polygon);
		   // Add a point and display the polyline again
		   polygon.addPoint(10., 10.);
		   System.out.println(polygon);
		   // Create Point objects from the coordinate array
		   Point[] points = new Point[coords.length];
		   for(int i = 0; i < points.length; i++)
		   points[i] = new Point(coords[i][0],coords[i][1]);
		   // Use the points to create a new polyline and display it
		   PolyLine newPoly = new PolyLine(points);
		   System.out.println(newPoly);
		   ShapeRectangle rectangle=new ShapeRectangle(0,1,2,3);
		
			rectangle=new ShapeRectangle(Math.random()*100,Math.random()*100,Math.random()*100,Math.random()*100);
			System.out.println("Coords of rectangle are:");
			System.out.println(rectangle);
			}
	}

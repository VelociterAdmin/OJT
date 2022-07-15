//package com.velociter.chapter6;
//
//public class TryPolyline {
//	
//	public static void main(String[] args) {
//		//Create array for cordinates pair
//		double[][] cords = { {1., 1.}, {1., 2.}, { 2., 3.},{-3., 5.}, {-5., 1.}, {0., 0.} };
//		//Create a polyline from the cordinates and display them
//		PolyLine polygon = new PolyLine(cords);
//		System.out.println(polygon);
//		
//		//Add a point and display the polyline again
//		polygon.addPoint(10.,10.);
//		System.out.println(polygon);
//			
//		//Create Point object from the cordinates array
//		Point[] points = new Point[cords.length];
//		for(int i = 0 ; i<cords.length; i++) {
//			points[i] =  new Point(cords[i][0],cords[i][1]);
//		}
//		
//		//Use the points and create a polyline and display them
//		PolyLine newpoly = new PolyLine(points);
//		System.out.println(newpoly);
//	}
//
//}

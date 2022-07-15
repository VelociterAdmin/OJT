package com.velociter.chapter6.exercise;

public class Point {
	protected double x = 0.0;
	protected double y = 0.0;
	
	//To get X value
		public double getX() {
			return x;
		}
		//To get Y value
		public double getY() {
			return y;
		}
		
		public Point() {
			// TODO Auto-generated constructor stub	
		}
		
		//Constructor to assign values to x and y
		public Point(double x,double y) {
			this.x = x;
			this.y = y; 
		}
		
		public Point (Point point) {
			x = point.x;
			y = point.y;
		}
		
		//Added new point
		public Point add(Point addNewPoint) {
			return new Point(x+addNewPoint.x,y+addNewPoint.y);
		}
		
		//String Representation of points
		public String toString() {
			return "Point" +x+ "," +y;
		}
		
		//Override Show()
		public void show(){
			System.out.println("\n"+toString());
		}
		
}

package com.velociter.chapter6modifiedquestions;


public class Point {
	public double x;
	public double y;
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
		
	}
	public Point(Point p) {
		x=p.x;
		y=p.y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public String toString() {
		return x+" "+y;
	}
	public double distance(Point end) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setNext(Point newEnd) {
		// TODO Auto-generated method stub
		
	}
	public Point getNext() {
		// TODO Auto-generated method stub
		return null;
	}

}

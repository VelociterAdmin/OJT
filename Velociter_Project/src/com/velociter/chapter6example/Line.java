package com.velociter.chapter6example;

public class Line {
	public Point start;
	public Point end;
	
	public Line(final Point start,final Point end) {
		this.start=new Point(start);
		this.end=new Point(end);
		
	}
	public Line(double xstart,double ystart,double xend,double yend) {
		start=new Point(xstart,ystart);
		end=new Point(xend,yend);

}
	public double length() {
		return start.distance(end);
		
	}
	public String toString() {
		return "("+start+"):("+end+")";
		
	}
	Point intersects(final Line line1) {
		Point localPoint = new Point(0, 0);
		double num = (this.end.y - this.start.y)*(this.start.x-line1.start.x) -(this.end.x-this.start.x)*(this.start.y-line1.start.y);
		double denom = (this.end.y - this.start.y)*(line1.end.x - line1.start.x)-(this.end.x - this.start.x)*(line1.end.y - line1.start.y);
		localPoint.x = line1.start.x + (line1.end.x - line1.start.x)*num/denom;
		localPoint.y = line1.start.y + (line1.end.y - line1.start.y)*num/denom;
		return localPoint;
		}
		

}

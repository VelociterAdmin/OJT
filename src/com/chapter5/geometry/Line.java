package com.chapter5.geometry;

public class Line {
	//Create a line from two points
	public Line(final Point start, final Point end) {
		this.start = new Point(start);
		this.end = new Point(end);
	}
	//Create line from two cordininates
	public Line(double xStart, double yStart, double xEnd, double yEnd) {
		start = new Point(xStart, yStart);
		end = new Point(xEnd, yEnd);
	}
	
	//Retrun a point as the intersection of two lines --  called the line object
	public Point Intersects(final Line line1) {
		Point localPoint = new Point(0,0);
		double num =	 (this.end.getY()-this.start.getY())
						*(this.start.getX()-line1.start.getX())
						-(this.end.getX())-(this.start.getX())
						*(this.start.getY()-line1.start.getY());
		
		
		double denom = 	 (this.end.getY()-this.start.getY())
						*(line1.end.getX()-line1.start.getX())
						-(this.end.getX())-(this.start.getX())
						*(line1.end.getY()-line1.start.getY());
		localPoint.setX(line1.start.getX() + (line1.end.getX() - line1.start.getX())*num/denom);
		
		localPoint.setY(line1.start.getY() + (line1.end.getY() - line1.start.getY())*num/denom);
		
		return localPoint;
	}
	
	//Convert to string
	public String toString() {
		return "("+start+"):("+end+")";							//As "(Start):(End)"
	}															//that is,(x1,y1):(x2,y2)
	//Data Members
	Point start,end;
}
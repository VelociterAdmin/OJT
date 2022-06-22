package com.velociter.chapter6modifiedquestions;


public class Line extends NewShape{
	public Point start;
	public Point end;
	
	public Line(Point start, Point end) {
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

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}

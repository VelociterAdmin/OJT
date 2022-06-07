package com.velociter.chapter5;

public class Line {
	public PointExample start;
	public PointExample end;
	
	public Line(final PointExample start,final PointExample end) {
		this.start=new PointExample(start);
		this.end=new PointExample(end);
		
	}
	public Line(double xstart,double ystart,double xend,double yend) {
		start=new PointExample(xstart,ystart);
		end=new PointExample(xend,yend);

}
	public double length() {
		return start.distance(end);
		
	}
	public String toString() {
		return "("+start+"):("+end+")";
		
	}
	PointExample intersects(final Line line1) {
		PointExample localPoint = new PointExample(0, 0);
		double num = (this.end.y - this.start.y)*(this.start.x-line1.start.x) -(this.end.x-this.start.x)*(this.start.y-line1.start.y);
		double denom = (this.end.y - this.start.y)*(line1.end.x - line1.start.x)-(this.end.x - this.start.x)*(line1.end.y - line1.start.y);
		localPoint.x = line1.start.x + (line1.end.x - line1.start.x)*num/denom;
		localPoint.y = line1.start.y + (line1.end.y - line1.start.y)*num/denom;
		return localPoint;
		}
		
}
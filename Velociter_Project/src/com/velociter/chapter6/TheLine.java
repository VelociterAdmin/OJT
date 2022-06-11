package com.velociter.chapter6;

public class TheLine{
	public NewPoint start;
	public NewPoint end;
	
	public TheLine(final NewPoint start,final NewPoint end) {
		this.start=start;
		this.end=end;
		
	}
	public TheLine(double xstart,double ystart,double xend,double yend) {
		start=new NewPoint();
		end=new NewPoint();

}
	public double length() {
		return start.distance(end);
		
	}
	public String toString() {
		return "("+start+"):("+end+")";
		
	}
	NewPoint intersects(final Line line1) {
		NewPoint localPoint = new NewPoint();
		double num = (this.end.y - this.start.y)*(this.start.x-line1.start.x) -(this.end.x-this.start.x)*(this.start.y-line1.start.y);
		double denom = (this.end.y - this.start.y)*(line1.end.x - line1.start.x)-(this.end.x - this.start.x)*(line1.end.y - line1.start.y);
		localPoint.x = line1.start.x + (line1.end.x - line1.start.x)*num/denom;
		localPoint.y = line1.start.y + (line1.end.y - line1.start.y)*num/denom;
		return localPoint;
		}
		
		
}

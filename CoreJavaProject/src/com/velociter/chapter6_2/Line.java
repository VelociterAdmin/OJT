package com.velociter.chapter6_2;
public class Line {

		Point start; 
		Point end;

		Line(final Point start, final Point end) {
		this.start = new Point(start);
		this.end = new Point(end);
		}
	
		Line(double xStart, double yStart, double xEnd, double yEnd) {
		start = new Point(xStart, yStart); 
		end = new Point(xEnd, yEnd);
		}
	
		public double length() {
		return start.distance(end); 
		}
		
		public String toString() {
		return "("+ start+"):("+ end +")";
		} 
		Point intersects(final Line line1) {
			Point localPoint = new Point(0, 0);
			double num = (this.end.y1-this.start.y1)*(this.start.x1-line1.start.x1) -(this.end.x1-this.start.x1)*(this.start.y1-line1.start.y1);
			double denom = (this.end.y1-this.start.y1)*(line1.end.x1-line1.start.x1) -	(this.end.x1-this.start.x1)*(line1.end.y1-line1.start.y1);
			localPoint.x1 = line1.start.x1 + (line1.end.x1-line1.start.x1)*num/denom;
			localPoint.y1 = line1.start.y1 + (line1.end.y1-line1.start.y1)*num/denom;
			return localPoint;
			}
}



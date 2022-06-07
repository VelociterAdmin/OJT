package com.velociter.chapter5;

public class Rectangle {

	public Point topLeft;
	public Point bottomRight;
	
	public Rectangle(final Point topLeft,final Point bottomRight) {
		this.topLeft=new Point(topLeft);
		this.bottomRight=new Point(bottomRight);
		
	}
	public Rectangle(double xtopLeft,double ytopLeft,double xbottomRight,double ybottomRight) {
		topLeft=new Point(xtopLeft,ytopLeft);
		bottomRight=new Point(xbottomRight,ybottomRight);

}
	public double length() {
		return topLeft.distance(bottomRight);
		
	}
	public String toString() {
		return "("+topLeft+"):("+bottomRight+")";
		
	}
	Point enclose(final Rectangle rect) {
		Point localPoint = new Point(0, 0);
		double num = (this.bottomRight.y - this.topLeft.y)*(this.topLeft.x-rect.topLeft.x) -(this.bottomRight.x-this.topLeft.x)*(this.topLeft.y-rect.topLeft.y);
		double denom = (this.bottomRight.y - this.topLeft.y)*(rect.bottomRight.x - rect.topLeft.x)-(this.bottomRight.x - this.topLeft.x)*(rect.bottomRight.y - rect.topLeft.y);
		localPoint.x = rect.topLeft.x + (rect.bottomRight.x - rect.topLeft.x)*num/denom;
		localPoint.y = rect.topLeft.y + (rect.bottomRight.y - rect.topLeft.y)*num/denom;
		return localPoint;
		}
}
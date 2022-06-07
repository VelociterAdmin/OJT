

package com.velociter.chapter5;

public class Rectangle {

	public Point topLeft;
	public Point bottomRight;
	
	public Rectangle(double x1,double y1,double x2,double y2){
		 topLeft = new Point(Math.min(x1,x2),Math.min(y1,y2));
		  bottomRight = new Point(Math.max(x1,x2),Math.max(y1,y2));
}

	public Rectangle (Point tl,Point br) {
		this(tl.getX(), tl.getY(), br.getX(), br.getY());
	  }
	public Rectangle(Rectangle rect) {
		 topLeft = new Point(rect.topLeft);
		 bottomRight = new Point(rect.bottomRight);
	}
		
	public String toString() {
		return "("+topLeft+"):("+bottomRight+")";
		
	}
	public Rectangle enclose(Rectangle rect) {
		return new Rectangle(Math.min(topLeft.getX(), rect.topLeft.getX()),
                Math.min(topLeft.getY(), rect.topLeft.getY()),
                Math.max(bottomRight.getX(), rect.bottomRight.getX()),
                Math.max(bottomRight.getY(), rect.bottomRight.getY()));
}
}
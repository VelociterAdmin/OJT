package com.velociter.chapter6;

import static java.lang.Math.sqrt;

public class NewPoint {
	public double x;
	public double y;


		public NewPoint(double d, double e) {
		// TODO Auto-generated constructor stub
	}

		public void NewPoint(double xval,double yval) {
			this.x=xval;
			this.y=yval;
		}
		
	  public void Point(final NewPoint oldPoint) {
		x=oldPoint.x;
		y=oldPoint.y;
	  }
		public void move(double xDelta,double yDelta) {
			x+=xDelta;
			y+=yDelta;
			
		}
	  public double distance(final NewPoint end) {
		  return sqrt((x-end.x)*(x-end.x)+(y-end.x)*(y-end.y));
		  
	  }
	public String toString() {
		return Double.toString(x)+","+(y);
	}

	public double getX() {
		
		return 0;
	}
	public double getY() {
		return 0;
	}

	public double Y() {
		
		return 0;
	}
}

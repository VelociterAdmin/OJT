package com.velociter.chapter5;
import static java.lang.Math.sqrt;
public class PointExample {
	
	public double x;
	public double y;


		public PointExample(double xval,double yval) {
			this.x=xval;
			this.y=yval;
		}
		
	  public PointExample(final PointExample oldPoint) {
		x=oldPoint.x;
		y=oldPoint.y;
	  }
		public void move(double xDelta,double yDelta) {
			x+=xDelta;
			y+=yDelta;
			
		}
	  public double distance(final PointExample aPoint) {
		  return sqrt((x-aPoint.x)*(x-aPoint.x)+(y-aPoint.x)*(y-aPoint.y));
		  
	  }
	public String toString() {
		return Double.toString(x)+","+(y);
	}

	
	}
	
	
       


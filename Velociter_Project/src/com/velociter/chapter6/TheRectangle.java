package com.velociter.chapter6;

public class TheRectangle {
	public NewPoint topLeft;
	public NewPoint bottomRight;
	
	public TheRectangle(double x1,double y1,double x2,double y2){
		 topLeft = new NewPoint();
		  bottomRight = new NewPoint();
}

	public TheRectangle (NewPoint tl,NewPoint br) {
		this(tl.getX(), tl.getY(), br.getX(), br.getY());
	  }
	public TheRectangle(TheRectangle rect) {
		 topLeft = new NewPoint();
		 bottomRight = new NewPoint();
	}
		
	public String toString() {
		return "("+topLeft+"):("+bottomRight+")";
		
	}
	public TheRectangle enclose(TheRectangle rect) {
		return new TheRectangle(Math.min(topLeft.getX(), rect.topLeft.getX()),
                Math.min(topLeft.Y(), rect.topLeft.getY()),
                Math.max(bottomRight.getX(), rect.bottomRight.getX()),
                Math.max(bottomRight.getY(), rect.bottomRight.getY()));
}

}

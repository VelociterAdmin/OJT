package com.velociter.chapter6;

public abstract class ShapeAndPolyline {
	protected double x;
	protected double y;
	
	public void move(double xPosition,double yPosition) {
		x +=xPosition;
		y +=yPosition;
		
	}
	public abstract void show();
		
	
}

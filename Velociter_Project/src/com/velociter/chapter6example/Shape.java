package com.velociter.chapter6example;

public abstract class Shape {
	protected double x;
	protected double y;
	
	public void move(double xPosition,double yPosition) {
		x +=xPosition;
		y +=yPosition;
		
	}
	public abstract void show();
		

}

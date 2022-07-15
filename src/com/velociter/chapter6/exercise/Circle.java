package com.velociter.chapter6.exercise;

public class Circle extends Shape{
	private double radius;
	
	public Circle(Point center,double radius) {
		// TODO Auto-generated constructor stub
		position = new Point(center);
		this.radius = radius;
	}
	
	//String Representation
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle : center"+position+" Radius :"+radius;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}

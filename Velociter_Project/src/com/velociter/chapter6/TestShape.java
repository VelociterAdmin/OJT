package com.velociter.chapter6;

public class TestShape implements Shape,Circle {
	
	public void radiusOfCircle() {
		double pi=3.14;
		double r=5;
		r=pi*r*r;
		System.out.println("Radius is :"+r);
	}
	public void areaOfRectangle() {
	double length=10;
	double breadth=5;
	double area;
    area=length*breadth;
     System.out.println("Area of rectangle :"+area);
	}
	
	public static void main(String[]args) {
		TestShape test=new TestShape();
		test.radiusOfCircle();
		test.areaOfRectangle();
		
	}

}

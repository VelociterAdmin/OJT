package com.velociter.chapter6;

public class ShapeList {

	public static void main(String[] args) {
		ShapeSemiCircle shape=new ShapeSemiCircle();
		double temp=shape.areaOfRectangle(5, 6);
		System.out.println(temp);
		temp=shape.getAreaOfCircle(5);
		System.out.println(temp);
		temp=shape.getAreaOfSemiCircle(4);
		System.out.println(temp);
	}

}

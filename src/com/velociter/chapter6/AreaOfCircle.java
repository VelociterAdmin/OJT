package com.velociter.chapter6;

public class AreaOfCircle extends AreaOfRectangle {
	public double getAreaOfCircle(double radius) {
		double AOC = Math.PI*radius*radius;
		return AOC;
	}
}

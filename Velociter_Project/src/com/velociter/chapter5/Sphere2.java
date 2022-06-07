package com.velociter.chapter5;

public class Sphere2 {
	static final double PI=3.14;
	static int count=0;
	double radius;
	double xCenter;
	double yCenter;
	double zCenter;
	
	public Sphere2() {
		radius=1.0;
        ++count;
	}
	public Sphere2(double x,double y,double z) {
		this();
		xCenter=x;
		yCenter=y;
		zCenter=z;
        
	}
	public static int getcount2() {
		return count;
	}
	public double getvolume2() {
		return 4/3*3.14*radius*radius*radius;
	}
}
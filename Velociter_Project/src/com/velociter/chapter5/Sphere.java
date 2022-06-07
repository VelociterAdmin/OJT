package com.velociter.chapter5;

public class Sphere {
	static final double PI=3.14;
	static int count=0;
	double radius;
	double xCenter;
	double yCenter;
	double zCenter;
	
	public Sphere(double x,double y,double z) {
		xCenter=x;
		yCenter=y;
		zCenter=z;
        radius=5.0;
        ++count;
}
	public Sphere() {
		xCenter=0.0;
		yCenter=0.0;
		zCenter=0.0;
        radius=5.0;
        ++count;
	}
	
	public static int getcount() {
		return count;
	}
	 public double getvolume() {
		return 4/3*3.14*radius*radius*radius;
	}

	
	}



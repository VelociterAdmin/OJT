package com.velociter.definingclasses;


public class Sphere {
	static final double PI = 3.14;										//Class Variable that has fixed value
	static int count = 0 ;												//Class Variable to count object
	double radius,xCenter,yCenter,zCenter;								//intanse Variables
	
	//Class Constructor
	Sphere(double theRadius, double x,double y,double z) {
		radius = theRadius;												//Set radius
		xCenter = x;													//Set Cordinates
		yCenter = y;
		zCenter = z;
		++count;														//Update object count
			
	}
	//Static method to report the number of object are created
	static int getCount() {
		return count;													//return current object count
	}
	
	//Instance method to calculate volume
	double  volume() {
		return 4.0/3.0*PI*radius*radius*radius;
	}

}

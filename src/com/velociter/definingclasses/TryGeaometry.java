package com.velociter.definingclasses;

public class TryGeaometry {

	public static void main(String[] args) {
		//Create two point and display them
		Point start = new Point(0.0,1.0);
		Point end = new Point(5.0,6.0);
		System.out.println("Points created are :"+ start +" and "+ end);
		
		//Create two lines and display them
		Line line1 = new Line(start,end);
		Line line2 = new Line(0.0,3.0,3.0,0.0);
		System.out.println("Lines created are :"+ line1 +" and "+line2);
	
	}
}


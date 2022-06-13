package com.velociters.experiment;

public class RightAngleTriangle {
	public int base;
	public int height;
	int area;
	public void area()
	{
		area=(base*height)/2;
	    System.out.println(area);
	}
	public RightAngleTriangle() {
		base=10;
		height=20;
	}
	public RightAngleTriangle(int b,int h) {
		base=b;
		height=h;
	}
	
	public static void main(String[] args)
	{
		RightAngleTriangle right=new RightAngleTriangle(5,6);
		right.area();
	}

}

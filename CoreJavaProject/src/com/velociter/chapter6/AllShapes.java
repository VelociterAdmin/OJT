package com.velociter.chapter6;

public class AllShapes implements Shapes {
	public void perimeterOfRectangle() {
	double length=5;
	double breadth=6;
	double perimeter=0;
	perimeter=2*(length+breadth);
	System.out.println("perimeter of rectangle is:"+perimeter);
	}
	public void perimeterOfSquare() {
		double length=5;
		double breadth=6;
		double perimeter=0;
	perimeter=4*length;
	System.out.println("perimeter of Squar is:"+perimeter);
	}

public static void main(String[] args) 
{
	AllShapes obj=new AllShapes();
	obj.perimeterOfRectangle();
	obj.perimeterOfSquare();
}
}

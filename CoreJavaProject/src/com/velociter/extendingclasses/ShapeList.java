package com.velociter.extendingclasses;
/*
 * Define a class, ShapeList, that can store an arbitrary collection of any objects of subclasses of
 * the Shape
 */
public class ShapeList extends AreaOfCircle {
	public static void main(String[] args) {
		AreaOfCircle getArea = new AreaOfCircle();										//Object of Subclass
		System.out.println("Area of Circle :"+getArea.getAreaOfCircle(25));				//Area of circle() 
		System.out.println("Area of Rectangle :"+getArea.getAreaOfRectangle(5, 10));	//Area of Rectangle()
	}		
}

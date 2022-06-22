package com.velociter.chapter6modified;

public class AllShapes {
	public static void main(String[] args) {
   Rectangle rectangle=new Rectangle(2.0,3.0);
   Circle circle=new Circle(3);
   Square square=new Square(4.0);
   rectangle.area();
   rectangle.perimeter();
   circle.area();
   circle.perimeter();
   square.area();
   square.perimeter();
	}
 }

package com.velociter.chapter6.exercise;
/*
Define an abstract base class Shape that includes protected data members for the (x, y) position of a shape, a public method to move a shape, and a public abstract method show()
to output a shape. Derive subclasses for lines, circles, and rectangles. Also, define the class
PolyLine that you saw in this chapter with Shape as its base class. You can represent a line as
two points, a circle as a center and a radius, and a rectangle as two points on diagonally opposite corners. Implement the toString() method for each class. Test the classes by selecting ten
random objects of the derived classes, and then invoking the show() method for each. Use the
toString() methods in the derived classes
 */
public abstract class Shape {
	
	protected Point position;
	
	public void move(double xCoords, double yCoords) {
		position.x = xCoords;
		position.y = yCoords;
	}
	public abstract void show();
}

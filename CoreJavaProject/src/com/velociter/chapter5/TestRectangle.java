package com.velociter.chapter5;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle[] rect=new Rectangle[4];
        Rectangle enclosing;
        for(int i=0;i<rect.length;i++)
        {
        	rect[i] = new Rectangle(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
        	System.out.print("Coords of rectangle " + i + " are: ");
            System.out.println(rect[i]);
        }
        enclosing = rect[0];
       
	 for(Rectangle rectangle : rect)  {
	      enclosing = enclosing.encloses(rectangle);
	    }
	 System.out.println("\nCoords of Enclosing rectangle are ");
	    System.out.println(enclosing);
	}
}


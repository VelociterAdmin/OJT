package com.velociter.chapter5;

public class PointTest {

	public static void main(String[] args) {
		
		Point start=new Point(4,8);	
		Point end = new Point(5,10);
		System.out.println("Points created are :"+start+" and "+end);
		
		Line line1=new Line(start,end);
		Line line2=new Line(0.0,3.0,3.0,0.0);
		System.out.println("Lines created are:"+line1+"and"+line2);
		
		System.out.println("Lines intersections:"+line2.intersects(line1));
		
		System.out.println("Lines intersections:"+line1.intersects(line2));
			
		}
        
		Rectangle rec=new Rectangle(topLeft, bottomRight);
        Rectangle rec=new Rectangle(0,0,0,0);
        System.out.println("Rectangle enclose:"+topLeft+" and "+bottomRight);
        

	}



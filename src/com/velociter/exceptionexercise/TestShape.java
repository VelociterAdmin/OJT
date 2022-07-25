//package com.chapter6.exercise;
package com.velociter.chapter6.exercise;

public class TestShape {
	 public static void main(String args[]) {
		    Shape[] shapes = new Shape[10];	    
		    Point[] pts = null;                  
		    Point pt1 = null;                   
		    Point pt2 = null;			               
		    double minRadius = 2.0;		          
		    double maxRadius = 20.0;		      
		    double maxDist = 100.0;		           
		    int minPts = 2;			                 
		    int maxPts = 15;                     
		    int choice;                        

		    for(int count=0;count<shapes.length;count++) {					 
		      
		      choice = (int)(3.0*Math.random()); 	

		      
		      switch(choice) {
		        case 0:				 	
		    
		          pt1 = new Point((int)(Math.random()*maxDist),(int)(Math.random()*maxDist));	
		          pt2 = new Point((int)(Math.random()*maxDist),(int)(Math.random()*maxDist));
		          shapes[count] = new Line(pt1,pt2); 	
		          break;

		        case 1:	
		          pt1 = new Point((int)(Math.random()*maxDist),(int)(Math.random()*maxDist));	
		          shapes[count] = new Circle(pt1, (int)(minRadius+(maxRadius-minRadius)*Math.random()));
		          break;

		        case 2:				
		          
		          pt1 = new Point((int)(Math.random()*maxDist),(int)(Math.random()*maxDist));	
		          pt2 = new Point((int)(Math.random()*maxDist),(int)(Math.random()*maxDist));
		          shapes[count] = new Rectangle(pt1,pt2);	
		          break;

		    
		         

		        default:                              
		          System.out.println("\nInvalid shape choice = "+choice);
		          System.exit(1);
		          break;
		      }
		    }

		    
		    for(int count=0;count<shapes.length;count++)
		      shapes[count].show();
		  }
}

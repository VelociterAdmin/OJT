package com.velociters.experiment;

public class AreaCalculation {
	private String colourOfSquare="black";
  public void areaOfSquare()
  {
	
	  int side=50;
	  int areaOfSquare;
	  areaOfSquare=side*side;
	  System.out.println(areaOfSquare);
	  
  }
  public class InnerClass
  {
	  public void areaOfRectangle()
	  {
		 int length=20;
		 int breadth=10;
		 int areaOfRectangle=0;
		 areaOfRectangle=length*breadth;
		 System.out.println(areaOfRectangle);
		 AreaCalculation a=new AreaCalculation();
		System.out.println( a.colourOfSquare);
	  }
  }
  public static class NestedClass {
	  static int radius=12;
	  static int areaOfCircle;
	  public static void areaOfCircle(){
       areaOfCircle=(int) (3.14*radius*radius);
       System.out.println(areaOfCircle);
	  }
  }
  public static void main(String[] args)
  {
	  
	 AreaCalculation area=new AreaCalculation();
	 area.areaOfSquare();
	 InnerClass area2=area.new InnerClass();
      area2.areaOfRectangle();
	System.out.println();
	 NestedClass area3=new NestedClass();
	 area3.areaOfCircle();
  }
  
}

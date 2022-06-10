package com.velociter.chapter6;

public class Sphere {
double xcenter,ycenter,zcenter,radius;
	
	/*public Sphere(double xcenter,double ycenter,double zcenter,double radius) {
		xcenter=this.xcenter;
		ycenter=this.ycenter;
		zcenter=this.zcenter;
		radius=this.radius;
		
	}*/
	public static void main(String[]args) {
		
	
  Sphere s=new Sphere();
  String b=s.getClass().toString();
  System.out.println(b);
}
}
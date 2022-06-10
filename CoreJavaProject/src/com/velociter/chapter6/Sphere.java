package com.velociter.chapter6;

public class Sphere {
	double xcenter,ycenter,zcenter,radius;
	Sphere(){
		
	}
	/*Sphere(double xcenter,double ycenter,double zcenter,radius)
	{
		xcenter=this.xcenter;
		ycenter=this.ycenter;
		zcenter=this.zcenter;
		radius=this.radius;
		
	}*/
	public static void main(String[]argd){
	Sphere s=new Sphere();
	String b=s.getClass().toString();
	System.out.println(b);
	
	}
	public class Employee{
		int id;
		String fristName;
		String lastName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFristName() {
			return fristName;
		}
		public void setFristName(String fristName) {
			this.fristName = fristName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
}


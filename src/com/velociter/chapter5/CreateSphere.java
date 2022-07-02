package com.velociter.chapter5;

public class CreateSphere {

	
	public static void main(String[] args) {
		System.out.println("Number of objects : "+Sphere.getCount());
		Sphere ball = new Sphere(10.0,1.0,1.0,1.0);							//create a sphere class object
		System.out.println("Number of object (ball) : "+Sphere.getCount());
		Sphere globe = new Sphere(12.0,1.0,1.0,1.0);						//create a sphere class object
		System.out.println("Number of object (globe) : "+Sphere.getCount());
		
		//Output the valume of each sphere
		System.out.println("Ball Volume : " +ball.volume() );
		System.out.println("Globe Volume : "+globe.volume());
		
	}

}

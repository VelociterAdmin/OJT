package com.velociter.chapter5;

public class SphereTest {

	public static void main(String[] args) {
		System.out.println("Number of object:"+Sphere.getcount());
		Sphere ball=new Sphere(4.0, 0.0, 0.0);
		System.out.println("Number of objects:"+ball.getcount());
		
		Sphere globe=new Sphere(12.0,1.0,1.0);
		System.out.println("Number of objects :"+globe.getcount());

		Sphere eightball=new Sphere(10.0, 10.0, 0.0);
		System.out.println("Number of object :"+Sphere.getcount());
        Sphere oddball=new Sphere();
        System.out.println("Number of object :"+Sphere.getcount());
        
        System.out.println("volume of ball="+ball.getvolume());
		System.out.println("volume of globe="+globe.getvolume());
		System.out.println("volume of eightball="+ eightball.getvolume());
		System.out.println("volume of oddball="+oddball.getvolume());
		
		
		
        
        
	}

}

package com.simple.javaproject;
/*
 *	The diameter of the Sun is approximately 865,000 miles. The diameter of the Earth is approximately 7,600 miles.
 *	Use the methods in the class Math to calculate:
 *	The volume of the Earth in cubic miles
 *	The volume of the Sun in cubic miles
 *	The ratio of the volume of the Sun to the volume of the Earth
*/
public class VolumeOfSphaere {
	int findRedius(int diameter) {
		int radius = diameter/2;
		return radius;
	}
	double findValumeOfSphere(int redius) {
		double volume;
		final double PI = Math.PI;
		volume = (4.0/3.0)*PI*Math.pow(redius,3);
		return volume;
	}
	public static void main(String[] args) {
		VolumeOfSphaere obj = new VolumeOfSphaere();
		int earthDiameter = 7600, sunDiameter = 865000;
		int earthRadius,sunRadius;
		double ratioValue ;
		earthRadius = obj.findRedius(earthDiameter);
		sunRadius = obj.findRedius(sunDiameter);
		double earthVolume,sunVolume;
		earthVolume = obj.findValumeOfSphere(earthRadius);
		System.out.println("Earth Volume : "+earthVolume+" Cubic Miles");
		sunVolume = obj.findValumeOfSphere(sunRadius);
		System.out.println("Sun Volume : "+sunVolume+" Cubic Miles");
		ratioValue = sunVolume/earthVolume;
		System.out.println("The Ratio of Volume of Sun to Valume of Earth is : "+ratioValue);
	}
}

package com.velociter.chapter2;

public class VolumeCalculate {

	public static void main(String[] args) {
		
		double sunDia=865000/2;
		double earthDia=7600/2;
		double sunVol=0;
		double earthVol=0;
		double ratioVol=0;
		
		System.out.println(""+sunDia);
		System.out.println(""+earthDia);
		
	    sunVol = 4/3*Math.PI*Math.pow(sunDia,3);

	    earthVol = 4/3*Math.PI*Math.pow(earthDia,3);
	    
	    System.out.println("Volume of the sun is " + sunVol );
	    System.out.println("Volume of the earth is " + earthVol );
	    
	    ratioVol = sunVol/earthVol;
	    System.out.println("Ratio="+ratioVol);
	}

}

package com.velociter.chapter2;

public class Volume {

	public static void main(String[] args) {
		double diameterOfSun=865000,diameterOfEarth=7600;
		
		double volumeOfSun=0,volumeOfEarth=0;
		
		double radiusSun=diameterOfSun/2;
		
		double radiusEarth=diameterOfEarth/2;
		
		
		volumeOfSun=(4/3*Math.PI*Math.pow(radiusSun, 3));
        System.out.println("volume of sun in cubic miles is:"+volumeOfSun);
        
        volumeOfEarth=(4/3*Math.PI*Math.pow(radiusEarth, 3));
        System.out.println("volume of Earth in cubic miles is:"+volumeOfEarth);
        
        double ratio=0;
        ratio=volumeOfSun/volumeOfEarth;
        System.out.println("the ratio is : "+ratio);
        double a=1000000000;
        a=volumeOfSun-a;
        System.out.println(a);
	}

}

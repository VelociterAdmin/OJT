package com.velociter.chapter5;

import java.util.Random;

public class MagicHat {
	private static int maxRabbits=5;
	private static Random select=new Random();
	private String hatName;
	private Rabbit rabbits[];
	
	public MagicHat(final String hatName) {
	this.hatName = hatName;
	Rabbit[] rabbits = new Rabbit[1+select.nextInt(maxRabbits)]; 
	for(int i = 0; i < rabbits.length; i++) {
	rabbits[i] = new Rabbit(); 
	}
	}
	public String toString() {
	String hatString = "\n"+ hatName + "  \n";
	for(Rabbit rabbit : rabbits) {
		hatString += " " + rabbit;
	}
	return hatString;
	}
	static class Rabbit{
		public static final int length = 5;
	    private static String[] rabbitNames = {"Floppsy", "Moppsy","Gnasher","Thumper"};
				
		static private int[] rabbitNamesCount = new int[rabbitNames.length];
	    private String name; 
				
		public Rabbit() {
	    int index = select.nextInt(rabbitNames.length);
	    name = rabbitNames[2] + (++rabbitNamesCount[2]);
				}
				
	     public String toString() {
	       return name;
				}
		
	}
	}



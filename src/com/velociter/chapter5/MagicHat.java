package com.velociter.chapter5;
import java.util.Random;
//Top Level Class
public class MagicHat {
	static int maxRabbits = 5; 												//Maximum Rabbits in hat
	static Random select = new Random();									//Random Number Generator
	public MagicHat(String hatName) {
			this.hatName = hatName;											//Store the hatName
			rabbits =  new Rabbit[1+select.nextInt(maxRabbits)];			//Random Rabbit

			for(int i = 0; i<rabbits.length; i++) {
				rabbits[i] = new Rabbit();
			}
	}
	//String representation of a hat
	public String toString() {
		//Hat name first
		String hatString = "\n" +hatName+ " contains:\n";
		for(Rabbit rabbit : rabbits) {
			hatString += "  "+ rabbit;
		}
		return hatString;
	}
		private String hatName; 										//Name of the hat
		private Rabbit rabbits[];										//Rabbits in the hat
		
		
		//Nested class
		static class Rabbit{
			//A name is a rabbitName followed by an integer
			static private String[] rabbitName = {"Flospy","Moppsy","Gnasher","Thumber"};
			static private int[] rabbitNameCount = new int[rabbitName.length];
			private String name;														//Name of the rabbit
			
			//Constructor for a rabbit
			Rabbit() {
				int index = select.nextInt(rabbitName.length);				//Get a random name index	
				name = rabbitName[index] + (++rabbitNameCount[index]);
			}
			
			//String representation of rabbit
			public String toString() {
				return name;
			}
		}
}

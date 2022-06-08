package com.velociter.chapter6;

public class Dog extends Animal {
		private String name; 
		private String breed;
		
		public Dog(String aName) {
			super("Dog");
			name=aName;
			breed="Unknown";
		}
		public Dog(String aName,String aBreed) {
			super("Dog");
			name=aName;
			breed=aBreed;
		}
		
		
		public String toString()
		{
			return "thats" + name + "the" + breed;
		}

	}




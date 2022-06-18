package com.velociter.chapter3;
/*
 * Write a program to display a random choice from a set of six choices for breakfast (you could
 * use any set; for example, scrambled eggs, waffles, fruit, cereal, toast, or yogurt).
 */
public class DisplayRandomChoiceOfSet {
	enum breakfast {Scrambled_Eggs ,Waffles, Fruits ,Cereal ,Toast ,Yogurt}
	public static void main(String[] args) {
		int randomChoice = (int)(6*Math.random());
//		randomChoice = 4;
		switch(randomChoice){
		case 0:
			System.out.println("Scrambled Eggs");
			break;
		case 1:
			System.out.println("Waffles");
			break;
		case 2:
			System.out.println("Fruits");
			break;
		case 3:
			System.out.println("Cereal");
			break;
		case 4:
			System.out.println("Toast");
			break;
		case 5:
			System.out.println("Yogurt");
			break;
		default:
			System.out.println("Unknown Choice");
			break;
		}
	}

}

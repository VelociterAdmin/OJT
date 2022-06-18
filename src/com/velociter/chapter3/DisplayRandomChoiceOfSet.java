package com.velociter.chapter3;

import java.util.LinkedHashSet;
import java.util.Set;

public class DisplayRandomChoiceOfSet {

	public static void main(String[] args) {
		Set<String> breakfast = new LinkedHashSet<String>();
		breakfast.add("Scumbbled Eggs");
		breakfast.add("Waffles");
		breakfast.add("Fruits");
		breakfast.add("Cereal");
		breakfast.add("Toast");
		breakfast.add("Yogurt");
		System.out.println("Breakfast : "+breakfast);
		for(int i=1;i<=(6*Math.random());i++) {
			for(String choice : breakfast) {
				System.out.println("Choice "+choice);
			}
		}
	}

}

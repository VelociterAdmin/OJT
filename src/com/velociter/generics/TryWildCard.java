package com.velociter.generics;

public class TryWildCard {
public static void main(String[] args) {
	int numbers[]  = new int[30];
	for(int i = 0 ; i < numbers.length; i++) {
		numbers[i] = (int) (1000*Math.random());	//Random number 0 - 999
	}
	
	//list sorting integer values
	int count= 0;
	System.out.println("Original numbers :");
	for(int number: numbers) {
		System.out.printf("%6d",number);
		if(++count %6 ==0) {
			System.out.println();
		}
	}
	
	//create the tree and add the integer to it
	BinaryTree<Integer> tree = new BinaryTree<Integer>();
	for(int number : numbers) {
		tree.add(number);
	}
	
	//Gte sorted values
	LinkedList<Integer> values = tree.sort();
	count =0;
	System.out.println("\nSorted values:");
	
	listAll(values);
	
	//Create an array of words to be sorted
	String[] words = {"vacillate", "procrastinate", "arboreal", "syzygy",
			"xenocracy", "zygote" , "mephitic", "soporific","grisly" , "gristly"};
	System.out.println("\n Original words :");
	for(String word : words) {
		System.out.printf("%-15s",word);
	}
	
	BinaryTree<String> cache = new BinaryTree<String>();
	for(String word : words) {
		cache.add(word);
	}
	LinkedList<String> sortedWords = cache.sort();
	
	//list the sorted words
	System.out.println("\nSorted Words:");
	listAll(sortedWords);

}
	public static void listAll(LinkedList<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}

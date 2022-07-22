package com.velociter.generics;

public class TryBinaryTree {

	public static void main(String[] args) {

//		BinaryTree<?> people = new BinaryTree<Manager>();
		
		
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
		for(Integer value:values) {
			System.out.printf("%6d",value);
			if(++count%6 ==0) {
				System.out.println();
			}
		}
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
		for(String word : sortedWords) {
				System.out.printf("%-15s",word);
				if(++count%6==0) {
					System.out.println();
				}
		}
	}

}

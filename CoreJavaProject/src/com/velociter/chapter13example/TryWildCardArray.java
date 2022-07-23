package com.velociter.chapter13example;

public class TryWildCardArray {

	public static void main(String[] args) {

		BinaryTree<?>[] trees = { new BinaryTree<Integer>(), new BinaryTree<String>() };
		LinkedListIterator<?>[] lists = new LinkedListIterator<?>[trees.length];

		int numbers[] = new int[30];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (1000 * Math.random()); // Random number 0 - 999
		}

		// list starting integer values
		int count = 0;
		System.out.println("Original numbers :");
		for (int number : numbers) {
			System.out.printf("%6d", number);
			if (++count % 6 == 0) {
				System.out.println();
			}
		}

		// Add the integers to the first tree
		for (int number : numbers) {
			((BinaryTree<Integer>) trees[0]).add(number);
		}

		// Create an array of words to be sorted
		String[] words = { "vacillate", "procrastinate", "arboreal", "syzygy", "xenocracy", "zygote", "mephitic",
				"soporific", "grisly", "gristly" };

		// list the words
		System.out.println("\nOriginal Words:");
		for (String word : words) {
			System.out.printf("%-15s", word);
			if (++count % 5 == 0) {
				System.out.println();
			}
		}

		// Insert the words into second tree
		for (String word : words) {
			((BinaryTree<String>) trees[1]).add(word);
		}

		// Sort the values in both trees
		for (int i = 0; i < trees.length; i++) {
			lists[i] = trees[i].sort();
		}

		// list the sorted values from both the trees
		for (LinkedListIterator<?> list : lists) {
			System.out.println("\nSorted results:");
			listAll(list);
		}

	}

	public static void listAll(LinkedListIterator<?> list) {
		int count = 0;
		for (Object obj : list) {
			System.out.println(obj + "   ");
			// if(++count%6==0) {
			// System.out.println();
			// }
		}

	}
}

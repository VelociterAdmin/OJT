package com.velociter.generics;


public class BinaryTree<T extends Comparable<? super T>>{
	
	//Add a value to the tree
	public void add(T value) {
		if(root ==  null) {									//If there's no root node
			root = new Node(value);							//Store it in root
		}else {												//Otherwise
			add(value,root);								//add it recursively
		}
	}
	
	//Recursive insertion of an object
	private void add(T value, Node  node) {
		int comparison = node.obj.compareTo(value);	
		if(comparison == 0) {								//if it is equal to current node
			++node.count;									//just incease count
			return;
		}
		if(comparison>0) {									//if it is less then the current node
			if(node.left == null) {							//and the left child node is not null
				node.left = new Node(value);				//Store it as left child
			}else {											//otherwise
			add(value,node.left);							//add it to left node
		}
	}else {													//It must be greater then the current node
		if(node.right == null) {							//so it must be to the right
			node.right = new Node(value);	
	}else {							
		add(value,node.right);
		}
	}
}
	// Create a list containing the values from the tree in sequence
	public LinkedList<T> sort(){
		values = new LinkedList<T>();							//create a linked lisy
		treeSort(root);											//sort the object into the list
		return values;
	}
	
	//Extract the tree node in sequence
	private void treeSort(Node node) {
		if(node != null ) {										//if the node is'nt null
			treeSort(node.left);								//process it to left child
		
			//List the duplicate objects for the current node
				for(int i = 0;i<node.count; i++) {
						values.addItem(node.obj);				
				}
				treeSort(node.right);
		}
	}
	
	LinkedList<T> values;										//store sorted values
	private Node root;
	
	//Private inner class defining nodes
	private class Node{
		Node(T value) {
			obj = value;
			count = 1;
		}
		T obj;													//object stored in node
		int count;												//Count of identical nodes
		Node left;												//The left child
		Node right;												//The right child
	}
	
}
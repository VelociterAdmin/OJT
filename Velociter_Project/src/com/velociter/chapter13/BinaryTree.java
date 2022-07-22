package com.velociter.chapter13;

public class BinaryTree<T extends Comparable<? super T>> {
	private Node root;

//Add a value to the tree
	public void add(T value) {
		if (root == null) {           
			root = new Node(value);          
		} else { 
			add(value, root);         
		}
	}

//Recursive insertion of an object
	private void add(T value, Node node) {
		int comparison = node.obj.compareTo(value);
		if (comparison == 0) {       
			++node.count;                  
			return;
		}
		if (comparison > 0) {                   
			if (node.left == null) {                 
				node.left = new Node(value);            
			} else { 
				add(value, node.left);             
			}
		} else {                              
			if (node.right == null) {                   
				node.right = new Node(value);
			} else {
				add(value, node.right);
			}
		}
			
		}
	// Create a list containing the values from the tree in sequence
	public LinkedList<T> sort(){
		values= new LinkedList<T>();
		treeSort(root);
		return values;
	}
	// Extract the tree nodes in sequence
	private void treeSort(Node node) {
	if(node != null) { 
	treeSort(node.left); 
	// List the duplicate objects for the current node
	for(int i = 0 ; i<node.count ; i++) {
	values.addItem(node.obj);
	}
	treeSort(node.right); 
	}
	}
	LinkedList<T> values;
	

	private class Node {
		T obj;
		int count;
		Node left;
		Node right;

		Node(T value) {
			obj = value;
			count = 1;
		}

	}

}

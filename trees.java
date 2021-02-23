package javaBasics;

import java.util.Scanner;

/**
	A SIMPLE BINARY TREE IMPLEMENTATION
	DONE IN JAVA.
*/

class Node {
	Node left;
	Node right;
	int data;
	Node(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Data: "+data;
	}
}

class BinTree {
	Node root;
	public static void main(String[] args) {
		BinTree tree = new BinTree();
		
		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(15);
		tree.addNode(30);
		tree.addNode(75);
		tree.addNode(85);
		
		tree.inOrderTraversal(tree.root);
	}
	
	
	/**
		Below method adds a new node to the tree.
	*/
	public void addNode(int data) {
		if(root == null) {
			root = new Node(data);
		} else {
			Node newNode = new Node(data);
			Node tmp = root;	//take tmp node as root to avoid losing the root node.
			Node parent;	//take a parent for tree and sub-tree traversal
			while(true) {
				parent = tmp;	//make parent as root in the 0th iteration.
				if(data < tmp.data) {
					tmp = tmp.left;
					if(tmp == null){	//if the left child is not present, then add the new node to the left of the parent.
						parent.left = newNode;
						return;
					}
				} else {	//if the data is greater than parent node, then go to the right side of the root node.
					tmp = tmp.right;
					if(tmp == null) {
						parent.right = newNode;  //add the new node to the right side of the parent.
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Node currNode) {
		if(currNode != null) {
			inOrderTraversal(currNode.left);  //keep going to the left most node of the tree
			System.out.println(currNode);     //upon reaching the left most node, print the data.	
			inOrderTraversal(currNode.right); //then traverse the right side.
		}
	}
	
	public void preOrderTraversal(Node currNode) {
		if(currNode != null) {
			System.out.println(currNode);     //print the data first.
			preOrderTraversal(currNode.left);  //keep going to the left most node of the tree	
			preOrderTraversal(currNode.right); //then traverse the right side.
		}
	}
	
	public void postOrderTraversal(Node currNode) {
		if(currNode != null) {
			postOrderTraversal(currNode.left);
			postOrderTraversal(currNode.right);
			System.out.println(currNode);
		}
	}
	
	public Node searchNode(int data) {
		Node snode = root;
		while(snode.data != data) {
			if(data < snode.data) {
				snode = snode.left;
			} else {
				snode = snode.right;
			}
			
			if(snode == null) {
				System.out.println("Node not found!");
				return;
			}
		}
	}
}
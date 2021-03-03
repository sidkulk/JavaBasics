package javaBasics;

class Node {
	Node left, right;
	int data;
	Node(int data) {
		this.data = data;
	}
}

class BinTree {
	static Node root;
	public static void main(String[] args) {
		BinTree.addNode(1);
		BinTree.addNode(10);
		BinTree.addNode(15);
		BinTree.addNode(22);
		BinTree.addNode(5);
		/**
			the binary tree structure for the given data: 
			
					1
					 \
					  \
					  10
					  /\
					 /	\
					5	 15
						  \
						   \
						    22
		*/
	}
	
	public static void addNode(int data) {
		if(root == null) {
			root = new Node(data);
			root.left = null;
			root.right = null;
		} else {
			Node curr = new Node(data);
			Node parent = root;
			while(true) {
				if(parent.data < data) {
					if(parent.right == null) {
						parent.right = curr;
						break;
					} else {
						parent = parent.right;
					}
				} else {
					if(parent.left == null) {
						parent.left = curr;
						break;
					} else {
						parent = parent.left;
					}
				}
			}
		}
	}
	
	public void inorder(Node node) {
		
	}
	
	public void preOrder(Node node) {
		
	}
	
	public void postOrder(Node node) {
		
	}
}
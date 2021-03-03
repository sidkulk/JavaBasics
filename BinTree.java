package javaBasics;

import static java.lang.System.out;

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
		
		out.println("--------------------------");
		out.println("Inorder Traversal");
		inorder(root);
		
		out.println("--------------------------");
		out.println("Preorder Traversal");
		preOrder(root);
		
		out.println("--------------------------");
		out.println("Postorder Traversal");
		postOrder(root);
		
		out.println("--------------------------");
		int depth = maxDepth(root);
		out.println("Max Depth of the tree: "+depth);
		
		out.println("--------------------------");
		int leafnode = leafNodeCnt(root);
		out.println("Max number of leaf nodes in tree: "+leafnode);
		
		/**
			the binary tree structure for the given data: 
			
				   1
					\
					 \
					 10
					 / \
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
	
	public static void inorder(Node node) {
		if(node == null) return;
		inorder(node.left);
		out.println(node.data);
		inorder(node.right);
	}
	
	public static void preOrder(Node node) {
		if(node == null) return;
		out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		out.println(node.data);
	}
	
	public static int maxDepth(Node node) {
		if(node == null) return 0;
		int left = maxDepth(node.left);
		int right = maxDepth(node.right);
		return Math.max(left, right)+1;
	}
	
	public static int leafNodeCnt(Node node) {
		if(node == null) return 0;
		else if(node.left == null && node.right == null) return 1;
		else return leafNodeCnt(node.left) + leafNodeCnt(node.right);
	}
}
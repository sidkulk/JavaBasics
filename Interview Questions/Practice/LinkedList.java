package javaBasics;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}

class SingleLinkedList implements LinkedListOperations{
	static Node head = null;
	int data; 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SingleLinkedList list = new SingleLinkedList();
		System.out.println("Singly LinkedList implementation: ");
		String ch = "y";
		
		do {
			System.out.println("1) Add node at the beginning");
			System.out.println("2) Add node at the End");
			System.out.println("3) Display all nodes in the list.");
			System.out.println("4) Delete first node.");
			System.out.println("5) Delete last node");
			System.out.println("6) Delete node at a given index");
			System.out.println("7) Add node at an index");
			System.out.println("8) update node at Beginning");
			System.out.println("9) update node at the end");
			System.out.println("10) update node at a given index");
			System.out.println("11) Get value at an index");
			System.out.println("12) Terminate program");
			int c = sc.nextInt();
			switch(c) {
				case 1: {
					System.out.print("Enter data: ");
					list.data = sc.nextInt();
					list.addNodeAtBeginning(list.data);
				}
				break;
				
				case 2:{
					System.out.print("Enter data: ");
					list.data = sc.nextInt();
					list.addNodeAtEnd(list.data);
				}
				break;
				
				case 3:{
					list.displayNodes();
					System.out.print("Null");
					System.out.println();
				}
				break;
				
				case 4:{
					list.deleteAtBeginning();
				}
				break;
				
				case 5:{
					list.deleteAtEnd();
				}
				break;
				
				case 6:{
					System.out.print("Enter an index (starting index is 0): ");
					int index = sc.nextInt();
					list.deleteAtIndex(index);
				}
				break;
				
				case 7:{
					System.out.print("Enter index: ");
					int index = sc.nextInt();
					System.out.println("\nEnter data: ");
					int data = sc.nextInt();
					list.addNodeAtIndex(index, data);
				}
				break;
				
				case 8:{
					System.out.print("Enter data: ");
					int data = sc.nextInt();
					list.updateAtBeginning(data);
				}
				break;
				
				case 9:{
					System.out.print("Enter data: ");
					int data = sc.nextInt();
					list.updateAtEnd(data);
				}
				break;
				
				case 10:{
					System.out.print("Enter index: ");
					int index = sc.nextInt();
					System.out.print("\nEnter data: ");
					int data = sc.nextInt();
					list.updateAtIndex(index, data);
				}
				break;
				
				case 11:{
					System.out.print("value at index: ");
					int index = sc.nextInt();
					System.out.println(getAtIndex(index));
				}
				break;
				
				case 12:{
					System.exit(0);
				}
				break;
				
				default: System.out.println("Enter a valid option!");
			}
		}while(ch.equals("y") || ch.equals("Y"));
	}
	
	public void addNodeAtBeginning(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
		} else {
			Node currNode = new Node(data);
			currNode.next = head;
			head = currNode;
		}
	}
	
	public void addNodeAtEnd(int data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
		} else {
			Node tmp = head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			Node currNode = new Node(data);
			tmp.next = currNode;
			currNode.next = null;
		}
	}
	
	public void addNodeAtIndex(int index, int data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
		} else if(index > getListLength()) {
			SingleLinkedList list = new SingleLinkedList();
			list.addNodeAtEnd(data);
		} else if(index < getListLength()) {
			SingleLinkedList list = new SingleLinkedList();
			list.addNodeAtBeginning(data);
		} else {
			if(index == 0) {
				SingleLinkedList list = new SingleLinkedList();
				list.addNodeAtBeginning(data);
			} else if(index == getListLength()) {
				SingleLinkedList list = new SingleLinkedList();
				list.addNodeAtEnd(data);
			} else {
				Node tmp = head;
				int cnt = 0;
				while(cnt < index - 1) {
					tmp = tmp.next;
					cnt += 1;
				}
				Node currNode = new Node(data);
				currNode.next = tmp.next;
				tmp.next = currNode;
			}
		}
	}
	
	public void deleteAtBeginning() {
		if(head == null) {
			System.out.println("Empty list! Nothing to delete!");
		} else {
			Node tmp = head;
			System.out.println("Node containing "+tmp.data+" will be removed!");
			head = tmp.next;
		}
	}
	public void deleteAtEnd() {
		if(head == null) {
			System.out.println("Empty list! Nothing to delete!");
		} else if(head.next == null) { //If there is just 1 node
			System.out.println("Node containing "+head.data+" will be removed!");
			head = null;
		}else if(head.next.next == null) {	//If there are just 2 nodes
			System.out.println("Node containing "+head.next.data+" will be removed!");
			head.next = null;
		} else {
			Node tmp = head;
			while(tmp.next.next != null) {	//if there are more than 2 nodes
				tmp = tmp.next;
			}
			System.out.println("Node containing "+tmp.next.data+" will be removed!");
			tmp.next = null;
		}
	}
	public void deleteAtIndex(int index) {
		if(index < 0) {
			System.out.println("Invalid index!");
		} else if(index > getListLength()) {
			System.out.println("Index out of bounds!");
		} else {
			if(index == 0){
				SingleLinkedList list = new SingleLinkedList();
				list.deleteAtBeginning();
			} else if(index == getListLength()-1) {
				System.out.println("List length: "+getListLength());
				SingleLinkedList list = new SingleLinkedList();
				list.deleteAtEnd();
			} else {
				Node tmp = head;
				int cnt = 0;
				while(cnt < index-1){
					tmp = tmp.next;
					cnt+=1;
				}
				System.out.println("Node with "+tmp.next.data+" will be deleted");
				tmp.next = tmp.next.next; 
			}
		}
	}
	
	public void updateAtBeginning(int data) {
		if(head == null) {
			System.out.println("Empty list, nothing to update!");
		} else {
			Node tmp = head;
			int prevData = tmp.data;
			tmp.data = data;
			System.out.println(prevData+" is now updated to "+tmp.data);
		}
	}
	public void updateAtEnd(int data) {
		if(head == null) {
			System.out.println("Empty list, nothing to update!");
		} else {
			Node tmp = head;
			int prevData;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			prevData = tmp.data;
			tmp.data = data;
			System.out.println(prevData+" is now updated to "+tmp.data);
		}
	}
	public void updateAtIndex(int index, int data) {
		if(head == null) {
			System.out.println("Empty list, nothing to delete!");
		} else if(index < 0) {
			System.out.println("Invalid index!");
		} else if(index > getListLength()) {
			System.out.println("Index out of bounds!");
		} else {
			Node tmp = head;
			int cnt = 0;
			int currData;
			while(cnt < index) {
				tmp = tmp.next;
				cnt += 1;
			}
			currData = tmp.data;
			tmp.data = data;
			System.out.println(currData+" updated to "+tmp.data);
		}
	}
	
	public void displayNodes() {
		if(head == null) {
			System.out.println("Empty list!");
		} else {
			Node tmp = head;
			while(tmp!=null) {
				System.out.print(tmp.data+"->");
				tmp = tmp.next;
			}
		}
	}
	
	public static int getListLength(){
		int len = 0;
		if(head == null)
			return len;
		else{
			len +=1;
			Node tmp = head;
			while(tmp.next!=null) {
				tmp = tmp.next;
				len += 1;
			}
			return len;
		}
	}
	
	public static int getAtIndex(int index) {
		int dataVal = -1;
		if(head == null) {
			System.out.println("Empty list!");
		} else if(index < 0) {
			System.out.println("invalid index");
		} else if(index > getListLength()) {
			System.out.println("invalid index");
		} else {
			int cnt = 0;
			Node tmp = head;
			while(cnt < index){
				tmp = tmp.next;
				cnt += 1;
			}
			dataVal = tmp.data;
		}
		return dataVal;
	}
}

interface LinkedListOperations {
	void addNodeAtBeginning(int data);
	void addNodeAtEnd(int data);
	void addNodeAtIndex(int index, int data);
	
	void deleteAtBeginning();
	void deleteAtEnd();
	void deleteAtIndex(int index);
	
	void updateAtBeginning(int data);
	void updateAtEnd(int data);
	void updateAtIndex(int index, int data);
	
	void displayNodes();
}

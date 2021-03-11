import java.util.*;
import static java.lang.System.out;

class Node<T extends Number> {
	Node next;
	T data;
	Node(T data) {
		this.data = data;
		next = null;
	}
}

class LinkedList<T extends Number> {
	private static Node head;
	private static Node tail;

	public static void main(String[] args) {
		
	}

	public void addAtHead(T data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
			tail.next = null;
			tail = head;
		} else {
			Node curr = new Node(data);
			curr.next = head;
			head = curr;
		}
	}

	public void addAtTail(T data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
			tail.next = null;
			tail = head;
		} else {
			Node curr = new Node(data);
			tail.next = curr;
			tail = curr;
		}
	}

	public void display() {
		if(head == null) {
			out.println("List is empty!");
		} else {
			Node tmp = head;
			while(tmp != null) {
				out.print(tmp.data+"->");
				tmp = tmp.next;
			}
			out.print("NULL");
		}
	}	
}

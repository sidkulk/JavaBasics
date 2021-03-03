package myClass;

import static java.lang.System.out;

class StackArr {
	private int[] array;
	private int top;
	private int capacity;
	
	StackArr(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public static void main(String[] args) {
		StackArr stck =  new StackArr(10);
		out.println("Top: "+stck.top+" Capacity: "+stck.capacity);
		stck.push(12);
		stck.push(13);
		out.println("element "+stck.pop()+" has been popped out");
		stck.push(4);
		out.println("Top most element: "+stck.peek());
		out.println("element "+stck.pop()+" has been popped out");
		out.println("element "+stck.pop()+" has been popped out");
		out.println("element "+stck.pop()+" has been popped out");
	}
	
	public int peek() {
		return array[top];
	}
	
	public int pop() {
		if(top == -1) {
			throw new RuntimeException("Stack underflow!");
		} else {
			return array[top--];
		}
	}
	
	public void push(int item) {
		if(top == capacity) {
			out.println("Entered the exception statement");
			throw new RuntimeException("Stack overflow!");
		} else {
			array[++top] = item;
		}
	}
	
	public void display(int[] stack) {
		for(Integer iter : array) {
			out.println(iter);
		}
	}
}

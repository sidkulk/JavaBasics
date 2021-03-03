package javaBasics;

import java.util.Scanner;

interface ArrayOper {
	void insertAtEnd(int[] arr, int element);
	void insertAtBegin(int[] arr, int element);
	void insertAtPos(int[] arr, int pos, int element);
}

class ArrayInsertOper implements ArrayOper {
	static int len = 0;
	public static void main(String[] args) throws Exception {
		int[] arr = new int[10]; //An array of size 10
		Scanner sc = new Scanner(System.in);
		/**
		*	A JAVA PROGRAM TO INSERT ELEMENTS IN AN ARRAY USING 3 METHODS:
			1) INSERT AT THE END
			2) INSERT AT THE BEGINNING
			3) INSERT AT A GIVEN POSITION IN THE ARRAY
		*/
		
		String ch = "y";
		
		do {
			System.out.println("Array insert operations: ");
			System.out.println("1) Insert at the end");
			System.out.println("2) Insert at the beginning");
			System.out.println("3) Insert at a given position");
			System.out.print("Enter option number: ");
			int opt = sc.nextInt();
			sc.nextLine();
			switch(opt) {
				case 1: {
					System.out.print("Enter the element to be inserted: ");
					int elem = sc.nextInt();
					sc.nextLine();
					ArrayInsertOper op = new ArrayInsertOper();
					op.insertAtEnd(arr, elem);
				}
				break;
				
				case 2: {
					System.out.print("Enter the element to be inserted: ");
					int elem = sc.nextInt();
					sc.nextLine();
					ArrayInsertOper op = new ArrayInsertOper();
					op.insertAtBegin(arr, elem);
				}
				break;
				
				case 3: {
					System.out.print("Enter the index at which the element is to be inserted (Index starts from 0): ");
					int pos = sc.nextInt();
					System.out.print("Enter the element to be inserted: ");
					int elem = sc.nextInt();
					sc.nextLine();
					ArrayInsertOper op = new ArrayInsertOper();
					op.insertAtPos(arr, pos, elem);
				}
				break;
				
				default: System.out.println("Enter a correct option!");
			}
			System.out.println();
			System.out.print("Do you want to repeat?: (y/n)");
			ch = sc.nextLine();
		} while(ch.equals("y"));
		
		System.gc();
	}
	
	public void insertAtEnd(int[] arr, int element){
		//Simply take the length of the array and insert the element at that position.
		if(arr.length < len){
			System.out.println("Array out of bound exception!");
		}
		else{
			arr[len] = element;
		}
		len += 1;
		
		System.out.println("Array after insertion: ");
		for(int iter : arr){
			System.out.println(" "+iter);
		} 
	}
	
	public void insertAtBegin(int[] arr, int element){
		//to be implemented
		for(int i=len-1;i>=0;i--) {
			arr[i+1] = arr[i];
		}
		
		arr[0] = element;
		len += 1;
		System.out.println("Array after insertion: ");
		for(int iter : arr) {
			System.out.println(" "+iter);
		} 
	}
	
	public void insertAtPos(int[] arr, int pos, int element){
		if(pos > arr.length) {
			System.out.println("ArrayIndexOutOfBounds");
		}
		else{
			if(pos <= (len-1)) {
				for(int i=len-1;i>=pos;i--) {
					arr[i+1] = arr[i];
				}
				arr[pos] = element;
				len += 1;
			}
			
			if(pos > len) {
				arr[pos] = element;
			}
		}
		
		System.out.println("Array after insertion: ");
		for(int iter : arr) {
			System.out.println(" "+iter);
		} 
	}
}

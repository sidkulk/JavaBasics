package arrayAddition;

import java.util.*;

class ArrayAdd {
	
	static int size = 0;
	static int sum = 0;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		add(arr);
		System.out.println("Sum is: "+ArrayAdd.sum);
	}
	
	public static void add(int[] arr) {
		sum += arr[size];
		System.out.println("Entered add function, sum value: "+ArrayAdd.sum);
		size++;
		if(size < arr.length){
			add(arr);
		}
	}
}
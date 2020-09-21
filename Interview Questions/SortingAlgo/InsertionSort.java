package sortingClassFiles;

import java.util.Scanner;

/**
*	INSERTION SORT PROGRAM
*	IN JAVA
*/

class InsertionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		int sortedArray[] = insSort(arr);
		
		System.out.println("Array after sorting: ");
		for(int i=0;i<size;i++)
			System.out.print(" "+sortedArray[i]);
		
		sc.close();
	}
	
	public static int[] insSort(int[] arr) {
		
	}
}
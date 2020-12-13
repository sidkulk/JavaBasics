package sortingClassFiles;

import java.util.Scanner;

/**
*	SELECTION SORT PROGRAM
*	IN JAVA
*/


class SelectionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		int sortedArray[] = SelSort(arr);
		
		System.out.println("Array after sorting: ");
		for(int i=0;i<size;i++)
			System.out.print(" "+sortedArray[i]);
		
		sc.close();
	}
	
	public static int[] SelSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int iMin = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[iMin])
					iMin = j;
			}
			int tmp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = tmp;
		}
		return arr;
	}
}

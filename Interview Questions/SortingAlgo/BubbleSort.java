package sortingClassFiles;

import java.util.Scanner;

/**
*	BUBBLE SORT PROGRAM
*	IN JAVA
*/

class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		int sortedArray[] = bubSort(arr);
		
		System.out.println("Array after sorting: ");
		for(int i=0;i<size;i++)
			System.out.print(" "+sortedArray[i]);
		
		sc.close();
	}
	
	public static int[] bubSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int flag = 0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]){
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
					flag = 1;
				}
				if(flag == 0)
					break;
			}
		}
		return arr;
	}
}
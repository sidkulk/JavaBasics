package javaBasics;

import java.util.Scanner;


/**
*	JAVA PROGRAM TO FIND MISSING ELEMENT FROM AN ARRAY
*	OF CONSEQUTIVE ELEMENTS IN SERIES
*/
class MissNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements in consequtive way with one element missing: ");
		
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Missing element is: "+missingElem(arr));
		
	}
	
	public static int missingElem(int[] arr){
		int sum = 0;
		int actualSum = 0;
		arr = SortInt(arr);
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		//System.out.println(sum);
		
		for(int i=arr[0];i<=arr[arr.length-1];i++){
			actualSum+=i;
		}
		//System.out.println(actualSum);
		int missing = actualSum - sum;
		return missing;
	}
	
	public static int[] SortInt(int[] arr){
		int flag = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-1-i;j++){
				if(arr[i]>arr[j]){
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = arr[j];
					flag = 1;
				}
			}
			if(flag==0)
				break;
		}
		return arr;
	}
}
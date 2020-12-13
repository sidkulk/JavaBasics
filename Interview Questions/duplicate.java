package javaBasics;

import java.util.Scanner;

class Duplicate{
	public static int NumberOfDuplicates(int n, int[] arr){
		int count = 0;
		for(int i=0;i<n-1;i++){
			if(arr[i]<0){
				continue;
			}
			else{
				for(int j=i+1;j<n;j++){
					if(arr[i] == arr[j]){
						arr[j] = -arr[j];
						count += 1;
						break;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int dups = NumberOfDuplicates(arr.length, arr);
		
		System.out.println("Number of duplicates are: "+dups);
	}
}

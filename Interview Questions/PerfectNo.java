package javaBasics;

import java.util.*;
/**
	Program to find a perfect number
	a perfect number is a number where:
	lets say 6
	now 6-> 1, 2, 3 are the factors.
	now 1+2+3 = 6.
*/

class PerfectNo{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		boolean des = isPerfect(n);
		if(des)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
	
	public static boolean isPerfect(int n){
		int sum = 0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum += i;
			}
		}
		
		if(i==n)
			return true;
		else
			return false;
	}
}
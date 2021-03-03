package javaBasics;

import java.util.*;

/**
	Program to find a prime number
	A prime number is a number which is divisible by 1 and the number itself.
	eg 23, 29, 3, 5, 7, 11, 13...
*/

class PrimeNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2;i<num;i++){
			if(num%1==0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+" is not a Prime number");
	}
}
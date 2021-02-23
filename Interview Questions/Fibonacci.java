package javaBasics;

/**
	Program to print fibonacci series...
	
	a fibonacci series is a series where in the sum of previous 2 consequtive elements gives the 3rd number
	eg: 1 1 2 3 5 8 13 21....
*/

class Fib{
	public static void main(String args[]){
		int a=1, b=1, k=0;
		System.out.print(a+" "+b);
		
		while(k<100){
			k = a+b;
			System.out.print(" "+k);
			a = b;
			b = k;
		}
	}
}
package javaBasics;

import java.util.*;

/**
	Program for armstrong number.
	eg
	153 -> (1*1*1) + (5*5*5) + (3*3*3) = 153
*/

class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		boolean des = isArmstrong(n);
		if(des)
			System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not an armstrong number");
	}
	
	public static boolean isArmstrong(int n){
		int sum = 0;
		int tmp = n;
		while(tmp>0){
			int num = tmp%10;
			tmp = tmp/10;
			sum = sum + (num*num*num);
		}
		
		if(sum==n)
			return true;
		else
			return false;
	}
}
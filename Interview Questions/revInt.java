package javaBasics;

import java.util.Scanner;

class RevInt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer to be reversed: ");
		int a = sc.nextInt();
		int tmp = a;
		tmp = RevMeth(a);
		
		System.out.println("Reversed integer: "+tmp);
		System.out.print("Using StringBuffer: ");
		RevInt.RevMethTwo(a);
	}
	
	public static int RevMeth(int a){
		int rev = 0;
		while(a>0){
			rev = rev*10 + a%10;
			a = a/10;
		}
		return rev;
	}
	
	public static void RevMethTwo(int a){
		String rev = Integer.toString(a);
		StringBuffer sb = new StringBuffer(rev);
		rev = sb.reverse().toString();
		System.out.println(rev);
	}
}

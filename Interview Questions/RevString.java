package javaBasics;

import java.util.*;
/**
*	A JAVA PROGRAM TO REVERSE A STRING
*
*/

/**
	METHOD 1: USING SUMPLE FOR LOOP AND String's charAt() METHOD
*/
class RevString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//
		System.out.println("Enter a string to reverse: ");
		String s = sc.nextLine();
		System.out.println("Reversed string is: "+revString(s));
		sc.close();
	}
	
	public static String revString(String str){
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--){
			rev = rev+str.charAt(i);
		}
		return rev;
	}
}
  /**
  *	METHOD 2: USING StringBuffer CLASS AND IT'S INBUILT METHOD .reverse() TO REVERSE THE STRING.
  */
class RevStrMethTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String s = sc.nextLine();
		
		System.out.println("Reversed String: "+RevString(s));
	}
	
	public static String RevString(String str){
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		return rev;
	}
}
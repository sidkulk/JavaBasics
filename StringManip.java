package javaBasics;

import java.util.Scanner;

class StringManip {
	public static void main(String args[])throws Exception {
		String str = "The rains have started";
		
		//substring(int Startindex, int EndIndex)
		System.out.println("Substring: "+str.substring(0, 10));
		
		//toLowerCase() and substring() methods
		System.out.println("Substring to lowercase: "+str.substring(str.indexOf("T"), str.indexOf(" ")).toLowerCase());
		
		//trim
		// 1. Soft Trim(only the ends)
		str = "   The  Rains   have";
		System.out.println(str.trim());
		str = "The rains have started";
		//2. Hard Trim (using replaceAll() method)
		System.out.println(str.replaceAll(" ", ""));
		
		//split() method
		String s[] = str.split(" ");
		System.out.println(s);
	}
}
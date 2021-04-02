package myClassPack;

import static java.lang.System.out;

class Solution {
	public static void main(String[] args) {
		String str = "this is a simple string";
		out.println("Given string: "+str);
		//finding the occurance of character s in the given string: 
		int strLen = str.length();
		str = str.replaceAll("s", "");
		int numberOfOccur = strLen - str.length();
		out.println("Occurences of char s in given string is: "+numberOfOccur);
	}
}

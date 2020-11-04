package javaBasics.alphaNumeric;

import java.util.*;

class AlphaNumClass {
	static String getStringAlphnum(int sizeOfString) {
		String alphaNum = "1234567890"+
							"ABCDEFGHIJKLMNOPQRSTUVWXYZ"+
							"abcdefghijklmnopqrstuvwxyz";
		
		StringBuilder sb = new StringBuilder(sizeOfString);
		for(int i=0;i<sizeOfString;i++){
			int index = (int)(alphaNum.length() * Math.random());
			sb.append(alphaNum.charAt(index));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception{
		int n = 20;
		System.out.println(AlphaNumClass.getStringAlphnum(n));
	}
}

package javaBasics;

import java.util.Scanner;

class StrRep {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("repeated characters: "+isRepeated(str));
	}
	
	public static boolean isRepeated(String str) {
		int flag = 0;
		for(int i=0;i<str.length();i++) {
			if(str.equals(" ")){
				flag = 1;
				break;
			}
			char charat = str.charAt(i);
			String character = Character.toString(charat);
			str.replaceAll(character,"");
		}
		System.out.println(str);
		
		if(flag == 1)
			return true;
		else
			return false;
	}
}
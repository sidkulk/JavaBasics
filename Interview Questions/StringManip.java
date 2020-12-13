package javaBasics.com.StringManip.Codes;
import java.util.*;

class StringManipClass{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter any character to be removed: ");
		String ch = sc.nextLine();
		
		System.out.println("String after removing the character "+ch+" : "+str1.replace(ch, "").trim());
		
		sc.close();
	}
}
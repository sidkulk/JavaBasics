package myClass;

import static java.lang.System.out;
import java.util.Scanner;

/**
*	Java program to convert Integers to Roman numerals..
*/

class IntToRoman {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.println("Enter an integer number: ");
		int num = sc.nextInt();
		
		out.println("Roman conversion of "+num+" is: "+intToRoman(num));
	}
	
	public static String intToRoman(int num) {
		String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] tthsnd = {"", "M", "MM", "MMM"};
		
		return tthsnd[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + units[num%10];
	}
}

/**

input = 1200

tthsn = 1200/1000 = 1 --> M
hundreds = (1200%1000)/100 = 200/100 = 2 =  --> CC
tens = (1200%100)/10 = 0/10 = 0 --> ""
units = (1200%10) = 0 --> ""

Ans = MCC
*/

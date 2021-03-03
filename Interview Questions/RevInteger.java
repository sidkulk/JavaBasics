package myClass;

import static java.lang.System.out;
import java.util.Scanner;

class RevInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.println("Enter an integer to be reversed: ");
		
		int num = sc.nextInt();
		out.println("Reverse of "+num+" is: "+revInt(num));
		out.println("is "+num+" a palindrome?: "+isPalindrome(num));
	}
	
	public static int revInt(int num) {
		int rev = 0;
		int tmp = num;
		int rem = 0;
		while(tmp!= 0){
			rem = tmp % 10;
			tmp = tmp / 10;
			rev = rev * 10 + rem;
		}
		
		return rev;
	}
	
	public static boolean isPalindrome(int num) {
		if(num == revInt(num)) {
			return true;
		} else return false;
	}
}

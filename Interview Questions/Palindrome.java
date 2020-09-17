/**
Java program to chick whether an integer is a palindrome or not.
*/

import java.util.*;

class Palin{
	public static void main(String args[]){
		System.out.println("Enter an Integer to check whether or not if it's a palindrome: ");
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			int num = sc.nextInt();
			int s = 0, r=0;
			int tmp = num;
			while(tmp>0){
				r = tmp%10;
				tmp = tmp/10;
				s = s*10+r;
			
		}
		
		if(num==s){
			System.out.println(num+" is a palindrome");
		}
		else
			System.out.println(num+" is not a palindrome");
		}
	}
}

class PalinStr {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String snum = Integer.toString(a);
		StringBuffer sb = new StringBuffer(snum);
		String srev = sb.reverse().toString();
		if(srev.equals(snum))
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");
	}
}
package javaBasics;

/**
*
*	Swapping String variables
*/

class StringSwapVar {
	public static void main(String args[]) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before string swap: "+a+" "+b);
		
		a = a+b;	//a = HelloWorld
		b = a.substring(0, a.length()-b.length());	//b = a.substring(0, 5);
		a = a.substring(b.length(), a.length());	//a = a.substring(5, 5);
		
		System.out.println("After string swap: "+a+" "+b);
	}
}
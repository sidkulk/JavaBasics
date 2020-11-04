package javaBasics;

/**
	JAVA PROGRAM TO SWAP 2 STRINGS
*/

class StringSwap {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before string swap: a- "+a+" b- "+b);
		//concatenate a and b and store in a.
		a = a+b; //a = HelloWorld
		
		//now use substring method of String class to cut last part and store in 'b' string.
		b = a.substring(0, a.length() - b.length()); //b = "Hello"
		
		//store initial length of the string in 'a'.
		a = a.substring(b.length());
		System.out.println("After string swap: a- "+a+" b- "+b);
	}
}
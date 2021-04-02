package stringBufferPack;

import java.util.*;
import static java.lang.System.out;

class StringBufferDemo {
	public static void main(String[] args) {
		//there are 3 ways to create a string: 
		/**
			1) String class	--- immutable
			2) StringBuffer --- mutable ; Synchronized
			3) StringBuilder --- mutable ; Asynchronized
		*/
		StringBuffer sb = new StringBuffer("Siddharth");
		System.out.println(sb);
		sb.append(" Kulkarni");
		out.println(sb);
		
		/**
			StringBuffer is a class to manipulate a String data..
			the constructors are as follows: 
			StringBuffer() {----}
			StringBuffer(CharSequence sq) {----}
			StringBuffer(String str) {----}
			StringBuffer(int capacity) {----}
		*/
		
		StringBuffer sb1 = new StringBuffer(); //an empty string buffer
		out.println("Capacity of string buffer: "+sb1.capacity()); //stores 16 characters (this size can increase)
		sb1 = sb1.append("test");
		out.println("Capacity of string buffer after appending: "+sb1.capacity());
		out.println("Length of string buffer after appending: "+sb1.length());
		
		//Methods: 
		//	1) capacity() --returns Integer type data which tells the number of characters that can fit
		out.println("Capacity of sb1: "+sb1.capacity());
		
		//	2) length() --returns the no. of characters currently present in a string buffer object
		out.println("Length of sb1 object: "+sb1.length());
		
		//	3) <T>append(T data) --adds some data at the end of current data inside a string buffer object
		out.println("Appending \"Test\" in sb1: "+sb1.append("Test"));
		
		//	4) charAt(int index) --returns a character present at given index (Note: Index starts from 0)
		out.println("Character at index 3 in sb1: "+sb1.charAt(3));
		
		//	5) delete(int start, int end) --deletes characters present in a string buffer object from start to (end-1) index
		out.println("After deleting 2 to 5 index characters in sb1: "+sb1.delete(2, 5));
		
		//	6) deleteCharAt(int index) --deletes a character at given index
		out.println("deleting character at index 3 in sb1: "+sb1.deleteCharAt(3));
		
		//	7) equals(T data) --returns a boolean value. True if the string buff object is refrencing the same object passed as args, false otherwise
		out.println("is sb1 equal to sb?: "+sb1.equals(sb)); //returns False	//Note: StringBuffer class does NOT override Object class's equals() method
		sb = sb1;
		out.println("is sb1 refrencing the same object as sb?: "+sb1.equals(sb)); //Note: the String class's equals() method checks the CONTENTS.
		
		//	8) indexOf(char/str) --returns the index of the character passed as args
		out.println("index of T in sb1: "+sb1.indexOf("T"));	//returns -1 if the character is not present
		out.println("index of e in sb1: "+sb1.indexOf("e"));
		
		//	9) lastIndexOf(char/str) --returns the Last index of the provided character as args
		out.println("last index of e in sb1: "+sb1.lastIndexOf("e"));
		
		//	10) insert(int index, string str) --inserts a string at a given index.
		out.println("inserting \"zzz\" at index 3 in sb1: "+sb1.insert(3, "zzz"));
		
		//	11) replace(int start, int end, String str) --replaces all characters from start index to end-1 index with str.
		out.println("replacing char at index 2 with \"AA\""+sb1.replace(2, 3, "AA"));
		
		//	12) reverse() --reverses all characters in a string buffer object
		sb1 = sb1.reverse();
		sb = new StringBuffer("reverse");
		out.println("reversing all characters in sb: "+sb.reverse());
		
		//	13) subSequence(int start, int end) --returns characters from start to end-1 index
		out.println("characters from index 2 to 4 in sb: "+sb.subSequence(2, 4));
		
		//	14) toString() --simply casts a string buffer obj to string. This returns a String type data
		String toStringVar = sb.toString();
		out.println(toStringVar);
		
		//	15) ensureCapacity(int minCapacity) --this method ensures a minimum capacity for a string buffer object
		out.println("Before ensure capacity in sb: "+sb.capacity());
		sb.ensureCapacity(100);
		out.println("After ensureCapacity(100) in sb: "+sb.capacity());
		
		//	16) setCharAt(int index, String char) --sets a character passed as args at a given index
		sb.setCharAt(3, 'D');
		out.println("setting \"D\" at index 3 in sb: "+sb);
		
		//	17) setLength(int length) --sets a specified string length to string buffer object
		sb.setLength(3);
		out.println("Afetr setting a length of 3 chars in sb: "+sb);
		
		//	18) trimToSize() --this method cuts the capacity of a string buffer obj to the no. of chars present (good for saving space)
		out.println("Before trimToSize() on sb: "+sb.capacity());
		sb.trimToSize();
		out.println("After trimToSize() on sb: "+sb.capacity());
	}
}

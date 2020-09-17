package javaBasics;

import java.util.Scanner;

//An interface with methods to be immplemented by a class
interface Operations {
	public int Add(int a, int b);
	public int Sub(int a, int b);
}

//a class that implements the interface. This class provides a partial implementation
// hance declared as an Abstract class.
abstract class AddClass implements Operations {
	public int Add(int a, int b){return (a+b);}
}

//this class provides implementation for the un-implemented method, by extending the 
// abstract class.
class SubClass extends AddClass {
	public int Sub(int a, int b){return (a-b);}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Enter another Integer value: ");
		int b = sc.nextInt();
		
		SubClass sb = new SubClass();
		
		System.out.println("Addition of "+a+" and "+b+" is: "+sb.Add(a, b));
		System.out.println("Difference of "+a+" and "+b+" is: "+sb.Sub(a, b));
		
		sc.close();
	}
}
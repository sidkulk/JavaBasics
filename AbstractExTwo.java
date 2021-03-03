package javaBasics;
import java.util.Scanner;

abstract class calc {
	public abstract int Add(int a, int b);
	public abstract int Sub(int a, int b);
}


abstract class calcChild extends calc {
	public int Add(int a, int b){
		return a+b;
	}
}

class calcImpl extends calcChild {
	public int Sub(int a, int b){
		return a-b;
	}
}

class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		calcImpl c = new calcImpl();
		
		System.out.println("Addition of "+a+" and "+b+" is: "+c.Add(a, b));
		System.out.println("Difference of "+a+" and "+b+" is: "+c.Sub(a, b));
	}
}
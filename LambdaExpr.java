package javaBasics;

import java.util.*;
import static java.lang.System.out;
/**
	===========================
		LAMBDA EXPRESSIONS
	===========================
	
	Lambda expression: A lambda expression is essentially an anonymous (unnamed) method. This method is 
					not exexuted on it's own, insted it is used to implement another method defined by a 
					Functional Interface.
					
	Functional Interface: A functional interface is an interface with one and onle one Abstract Method. It 
					is also referred to as SAM (Single Abstract Method). A functional interface represents a 
					single action. It defines a target type of a lambda expression
*/

/**
	LAMBDA EXPRESSION FUNDAMENTALS: Lambda expression introduces a new syntax element and operator. The new 
	operator is called the arrow operator "->" It divides a lambda expession into two parts: The right side is the lambda body
	and the left side is the parameter list. If there are no args then, empty list is provided.
	
	EX: () -> 123.32
	this lambda expression has no parameters and returns a double therefore it is 
	equivalent to: 	
		double MyMath() {return 123.43;}
		
	More ex: double MyMath() {return Math.random() * 100;}
	this expression returns a double type, where a random number is generated and is multiplied with 100.
	
	When a lambda expression requires a parameter, it is specified in the parameter list: 
	(n) -> (n%2) == 0;
	this lambda expession returns true if the the value of parameter n is even.
*/


//A functional interface with only ONE abstract method..
interface MyInterface {
	double getValue();
}

interface Calculator {
	double getValue(double x, double y);
}

interface EvenOdd {
	boolean isEven(int ob);
}

class Main {
	public static void main(String[] args) {
		MyInterface myinter = () -> Math.random() * 100;
		
		Calculator addOper = (x, y) -> (x + y);
		Calculator subOper = (x, y) -> (x - y);
		Calculator mulOper = (x, y) -> (x * y);
		Calculator divOper = (x, y) -> (x / y);
		
		System.out.println(myinter.getValue());
		System.out.println("addition of 1 and 1: "+addOper.getValue(1, 1));
		System.out.println("subtraction of 2 and 1: "+subOper.getValue(2, 1));
		System.out.println("multiplication of 3 and 5: "+mulOper.getValue(3, 5));
		
		try {
			double res = divOper.getValue(1, 0);
			System.out.println("division of 1 and 0: "+res);
		} catch(Exception e) {
			System.out.println("Exception occured: "+e);
			e.printStackTrace();
		}
		
		EvenOdd iObj = (n) -> (n%2==0);
		out.println("is 2 an even number?: "+iObj.isEven(2));
		out.println("is 3 an even number?: "+iObj.isEven(3));
		
	}
}

//Block Lambda Expressions: 

/**
 * 	These are very much the same compared to Expression bodies that we 
 * 	just talked about in the previous section.
 * 
 * 	Block Lambda expressions are enclosed in curly braces and explicitely 
 * 	some value. So they must contain a return statement.
 **/

interface NumFun {
	int getResult(int n); //A functional interface
}

class BlockLambDemp {
	public static void main(String[] args) {
		NumFun num = (n) -> {
			
			int res = 1;
			for(int i=1;i<=n;i++) {
				res = res*i;
			}
			
			return res;
		};
		
		out.println("The factorial of of 2 is: "+num.getResult(2));
		out.println("The factorial of of 10 is: "+num.getResult(10));
	}
}

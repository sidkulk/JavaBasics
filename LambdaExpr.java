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



class Main {
	public static void main(String[] args) {
		
	}
}

package javaBasics;

/**
*	Finally keyword concept
*/

class TestClass {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		try{
			System.out.println("Inside try block");
		}catch(Exception e){
			System.out.println("Inside catch block");
		}
		
		finally{
			System.out.println("Inside finally");
			System.out.println("This block will execute before program terminates..");
		}
	}
}

/**
	finally{} block will always execute before the program terminates...no matter what..
*/


//here a try-catch  block without a catch is used. finally will again execute before the program ends
class TestTwo {
	public static void main(String args[]) {
		test2();
	}
	
	public static void test2() {
		try{
			System.out.println("Inside try block");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}

class TestThree {
	public static void main(String[] args) {
		test3();
	}
	
	public static void test3() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i/10;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch");
			System.out.println("divide by zero error "+e);
		}
		finally{
			System.out.println("Finally block executed anyhow..");
		}
	}
}

class TestFour {
	public static void main(String[] args) {
		test3();
	}
	
	public static void test3() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i/10;
		}
		catch(NullPointerException e) {
			System.out.println("Inside catch");
			System.out.println("divide by zero error "+e);
		}
		finally{
			System.out.println("Finally block executed anyhow..");
		}
	}
}

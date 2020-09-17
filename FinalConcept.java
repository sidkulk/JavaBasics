package javaBasics;

class FinalConcept {
	public static void main(String args[]) {
		
		//-----------final Keyword------------------
		final int i = 10;	//final keyword makes the value of i constant.
		
		System.out.println("Value of I: "+i);
		
		/**
		
		i = 20; will throw compile-time error
		Error: cannot assign a value to final variable i
		
		*/
		
		// To avoid inheritance, we use final keyword.
		
	}
}

/**

------------------------------------------------
final keyword to prevent inheritance.... Ex: 

final class Parent {
		
}

class child extends Parent {
	
} 

will give an error: error: cannot inherit from final Parent
class child extends Parent {

------------------------------------------------
final can also be used to prevent method overriding in inheritance. Eg:


class Parent {
	public final void test() {
		System.out.println("Inside test");
	}
}	

class child extends Parent {
	public void test() {
		System.out.println("Inside child");
	}
}

will throw an error: error: test() in child cannot override test() in Parent
        public void test() {
                    ^
  overridden method is final
*/


package javaBasics;

interface A {
	void MethodA();
}

class AImp implements A {
	public void MethodA(){
		System.out.println("A implemented");
	}
}

/**
*
*	Old way of implementing an interface
*/
class MainClass {
	public static void main(String[] args) throws Exception {
		A obj;
		obj = new AImp();
	}
}

/**
*
*	Java 8 new feature of anaonymous implementation
*
*/
class MainClassTwo {
	public static void main(String[] args) {
		A obj = new A(){	//ANonymous Inner class
			public void MethodA(){
				System.out.println("Anaonymous method");
			}
		};
		
		obj.MethodA();
	}
}


/**
*	Using Lambda Expression
*/

class LambdaExpr {
	public static void main(String[] args) {
		A obj = () -> System.out.println("Implemented interface without anonymous inner class");
		obj.MethodA();
	}
}
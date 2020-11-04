package javaBasics;

/**
*
*	DEMONSTRATION OF INNER CLASSES AND OUTER CLASSES.
	A VERY POWERFUL FEATURE OF JAVA. INTRODUCED IN JDK 1.1
*
*/

class University {	
	
	//outer Class (Enclosing class)
	
	class DepartOne {
		//Inner Class (Enclosed Class)
	}
	
	class DepartTwo {
		//Inner Class (Enclosed Class)
	}
}

//The relation between inner class and outer class is HAS-A relation(Composition /Aggrigation).

/**

THERE ARE 4 TYPES OF INNER CLASSES:
1 --> NORMAL OR REGULAR INNER CLASS.
2 --> METHOD LOCAL INNER CLASS.
3 --> ANONYMOUS INNER CLASSES (INNER CLASS WITHOUT A NAME)
4 --> STATIC NESTED CLASSES.

*/

//////////////////////////////
//							//
//			THEORY			//	
//							//
//////////////////////////////

/*
	1) Normal or Regular Inner Class.
	Definition: If we are declaring any inner class directly after the outer class with a name and without the static modifier
				then such type of inner class is called Normal or regular inner class.
*/

//eg: 
/*
class Outer {
	class inner{
		
	}
}
*/
// after compolimh the program the .class file generated for Outer class is Outer.class and for inner class it's Outer$inner.class
//	the .class files are generated in such a general way: outerClassname$InnerClassName.class

//the following code will compile successfully:

class OuterClass {
	class InnerClass {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Inside outer class");
	}
}
//Output: Inside outer class

//the following code will throw a compile time error:
/*
class Outer {
	class Inner {
		public static void main(String[] args) {
			System.out.println("Inside Inner class");
		}
	}
}
*/
/*
	Error thrown: 
	.\InnerClasses.java:59: error: Illegal static declaration in inner class Outer.Inner
                public static void main(String[] args) {
                                   ^
  modifier 'static' is only allowed in constant variable declarations
1 error

This is because we cannot declare any static members inside inner classes, hence we can't declare main method
and hence we cannot run inner class directly from terminal/cmd
*/

//////////////////////////////////////////////////////////////////////////
/*
	CASE 1:
	CALLING INNER CLASS METHODS FROM STATIC AREA OF OUTER CLASS 
*/

class OuterClassEx {
	class InnerClassEx {
		public void methodOne() {
			System.out.println("Inside inner class!");
		}
	}
	
	public static void main(String[] args) {
		OuterClassEx outer = new OuterClassEx();	//create outer class object.
		OuterClassEx.InnerClassEx inner = outer.new InnerClassEx(); //then create inner class object. Note the declaration style.
		
		inner.methodOne();
		
	}
}
//output: Inside inner class!
/**
	the object creation can also be done like this as well:
	OuterClassEx.InnerClassEx inner = mew OuterClassEx().new InnerClassEx();
*/
//ex:

class OuterClassNew {
	class InnerClassNew {
		public void methodTwo() {
			System.out.println("Inside Inner class");
		}
	}
	
	public static void main(String[] args) {
		OuterClassNew.InnerClassNew inner = new OuterClassNew().new InnerClassNew(); //object declaration and creation in one line
		inner.methodTwo();
	}
}
//output: Inside Inner class

/**
	ANOTHER WAY OF CALLING METHOD OF INNER CLASS FROM STATIC AREA OF OUTER CLASS:
*/

class OuterClassExTwo {
	class InnerClassExTwo {
		public void methThree() {
			System.out.println("Inside inner class");
		}
	}
	
	public static void main(String[] args) {
		new OuterClassExTwo().new InnerClassExTwo().methThree();
	}
}

//output: Inside inner class

///////////////////////////////////////////////////
/*
	CASE 2:
	CALLING INNER CLASS METHODS FROM INSTANCE AREA OF OUTER CLASS
*/

class OuterClassThree {
	class InnerClassThree {
		public void methThree() {
			System.out.println("Inside Inner Class");
		}
	}
	
	public void methCall(){
		InnerClassThree inner = new InnerClassThree();
		inner.methThree();
	}
	
	public static void main(String[] args) {
		OuterClassThree outer = new OuterClassThree();
		outer.methCall();
	}
}
//Output: Inside Inner Class
//A very straight forward syntax. Most preffered way to call inner class methods.

///////////////////////////////////////////////////////
/*
	ACCESSING INNER CLASS  FROM ANOTHER CLASS
*/

class OuterClassFour {
	class InnerClassFour{
		public void methFour(){
			System.out.println("Inside inner class");
		}
	}
}

class AnotherClass {
	public static void main(String[] args) {
		OuterClassFour.InnerClassFour inner = new OuterClassFour().new InnerClassFour();
		inner.methFour();
	}
}